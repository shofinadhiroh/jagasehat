package com.shofi.uascihuy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityKontak extends AppCompatActivity {

    Button buttonyna1, buttonyna2, buttonyna3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youarenotaloneiamherewithyou);

        buttonyna1 = (Button) findViewById(R.id.buttonyna1);
        buttonyna2 = (Button) findViewById(R.id.buttonyna2);
        buttonyna3 = (Button) findViewById(R.id.buttonyna3);

        buttonyna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0222005892"));
                startActivity(i); //jalankan Intent
            }
        });

        buttonyna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081220444445"));
                startActivity(i); //jalankan Intent
            }
        });

        buttonyna3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:08112001504"));
                startActivity(i); //jalankan Intent
            }
        });
    }

}