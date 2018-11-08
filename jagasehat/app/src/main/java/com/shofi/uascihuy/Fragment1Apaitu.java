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
public class Fragment1Apaitu extends Fragment {

    Button mengapa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1_apaitu, container,
                false);


        mengapa = (Button) rootView.findViewById(R.id.button1);


        mengapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment2Mengapa fragment2Mengapa = new Fragment2Mengapa();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment2Mengapa);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }

}
