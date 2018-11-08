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
public class Fragment2Mengapa extends Fragment {

    Button sadari;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2_mengapa, container,
                false);


        sadari = (Button) rootView.findViewById(R.id.button2);


        sadari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment3Salira fragment3Salira = new Fragment3Salira();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment3Salira);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

        return rootView;
    }
}
