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
public class Fragment5Pengobatan extends Fragment {

    Button youarenotaloneimherewithyou;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment5_pengobatan, container,
                false);


        youarenotaloneimherewithyou = (Button) rootView.findViewById(R.id.button5);


        youarenotaloneimherewithyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment6Youarenotalone fragment6Youarenotalone = new Fragment6Youarenotalone();
                //buat object fragmentkedua

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_content, fragment6Youarenotalone);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

        return rootView;
    }
}