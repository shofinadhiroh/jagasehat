package com.shofi.uascihuy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4Cegah extends Fragment {


    Button konsultasi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment4_cegah, container,
                false);


        konsultasi = (Button) rootView.findViewById(R.id.button4);


        konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment5Pengobatan fragment5Pengobatan = new Fragment5Pengobatan();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment5Pengobatan);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

        return rootView;
    }
}