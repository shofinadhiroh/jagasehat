package com.shofi.uascihuy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    LinearLayout lineApaitu, lineSalira, linePencegahan, linePengobatan, lineYouarenotalone, lineKontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        lineApaitu = (LinearLayout) findViewById(R.id.apaitu);
        lineSalira = (LinearLayout) findViewById(R.id.salira);
        linePencegahan = (LinearLayout) findViewById(R.id.pencegahan);
        linePengobatan = (LinearLayout) findViewById(R.id.pengobatan);
        lineYouarenotalone = (LinearLayout) findViewById(R.id.youarenotalone);
        lineKontak = (LinearLayout) findViewById(R.id.kontak);


        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);


    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        lineApaitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //memulai transaction fragment manager

                Fragment1Apaitu fragment1Apaitu = new Fragment1Apaitu();
                //membuat object fragmentPertama
                transaction.add(R.id.frame_content, fragment1Apaitu);
                //menambahkan fragment
                transaction.addToBackStack("");
                //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
                transaction.commit();
            }
        });

        lineSalira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //memulai transaction fragment manager

                Fragment3Salira fragment3Salira = new Fragment3Salira();
                //membuat object fragmentPertama
                transaction.add(R.id.frame_content, fragment3Salira);
                //menambahkan fragment
                transaction.addToBackStack("");
                //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
                transaction.commit();
            }
        });

        linePencegahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //memulai transaction fragment manager

                Fragment4Cegah fragment4Cegah = new Fragment4Cegah();
                //membuat object fragmentPertama
                transaction.add(R.id.frame_content, fragment4Cegah);
                //menambahkan fragment
                transaction.addToBackStack("");
                //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
                transaction.commit();
            }
        });

        linePengobatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
       /* *getSupportFragmentManager = inisialisasi nilai FragmentManager untuk berinteraksi
            dengan Activity saat ini
         */
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //memulai transaction fragment manager

                Fragment5Pengobatan fragment5Pengobatan = new Fragment5Pengobatan();
                //membuat object fragmentPertama
                transaction.add(R.id.frame_content, fragment5Pengobatan);
                //menambahkan fragment
                transaction.addToBackStack("");
                //dapat menyimpan fragment ke dalam state ,ketika tombol back diklik
                transaction.commit();
            }
        });

        lineYouarenotalone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, ActivityYouarenotaloneiamherewithyou.class);
                startActivity(i); //jalankan Intent
            }
        });

        lineKontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, ActivityKontak.class);
                startActivity(i); //jalankan Intent
            }
        });
    }
}
