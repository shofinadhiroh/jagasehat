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
public class Fragment3Salira extends Fragment {


    Button salira1, salira2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3_salira, container,
                false);


        salira1 = (Button) rootView.findViewById(R.id.buttonsalira1);
        salira2 = (Button) rootView.findViewById(R.id.buttonsalira2);


        salira1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment4Cegah fragment4Cegah = new Fragment4Cegah();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment4Cegah);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        salira2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment5Pengobatan fragment5Pengobatan = new Fragment5Pengobatan();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment5Pengobatan);
                fragmentTransaction.commit();

            }
        });
        return rootView;
    }
}
