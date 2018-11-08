package com.shofi.uascihuy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment6Youarenotalone extends Fragment {


    Button komunitas;
    Button bpjs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment6_youarenotalone, container,
                false);


        komunitas = (Button) rootView.findViewById(R.id.button61);
        bpjs = (Button) rootView.findViewById(R.id.button62);

        komunitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(rootView.getContext(), ActivityYouarenotaloneiamherewithyou.class);
                startActivity(i);
            }
        });

        bpjs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(rootView.getContext(), ActivityKontak.class);
                startActivity(i);
            }
        });

        return rootView;
    }
}