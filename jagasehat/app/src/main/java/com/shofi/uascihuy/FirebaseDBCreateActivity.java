package com.shofi.uascihuy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseDBCreateActivity extends AppCompatActivity {

    private DatabaseReference database;

    // variable fields EditText dan Button
    private Button btSubmit;
    private EditText etEmail;
    private RadioGroup rgjk;
    private Spinner sUsia, sPendidikan, sPekerjaan;
    private PrefManager prefManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_create);

        etEmail = (EditText) findViewById(R.id.et_email);
        sUsia = (Spinner) findViewById(R.id.usia);
        sPendidikan = (Spinner) findViewById(R.id.pendidikan);
        sPekerjaan = (Spinner) findViewById(R.id.pekerjaan);
        rgjk = (RadioGroup) findViewById(R.id.jk);
        btSubmit = (Button) findViewById(R.id.bt_submit);

        database = FirebaseDatabase.getInstance().getReference();

        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gender = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gender);

                if(!isEmpty(jk.getText().toString()) && !isEmpty(sUsia.getSelectedItem().toString()) && !isEmpty(sPendidikan.getSelectedItem().toString())&& !isEmpty(sPekerjaan.getSelectedItem().toString())&& !isEmpty(etEmail.getText().toString()))
                    submitDemografi(new Demografi(jk.getText().toString(), sUsia.getSelectedItem().toString(), sPendidikan
                            .getSelectedItem().toString(),sPekerjaan.getSelectedItem().toString(), etEmail.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.bt_submit), "Data tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        jk.getWindowToken(), 0);
            }
        });

    }

    private boolean isEmpty(String s) {
        return TextUtils.isEmpty(s);
    }

    private void submitDemografi(Demografi demografi) {

        database.child("demografi").push().setValue(demografi).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

                Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
                Intent intent = new Intent(FirebaseDBCreateActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(FirebaseDBCreateActivity.this, WelcomeActivity.class));
        finish();
    }


    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, FirebaseDBCreateActivity.class);
    }
}