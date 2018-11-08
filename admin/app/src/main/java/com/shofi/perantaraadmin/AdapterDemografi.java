package com.shofi.perantaraadmin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDemografi extends RecyclerView.Adapter<AdapterDemografi.ViewHolder> {

    private ArrayList<Demografi> daftarDemografi;
    private Context context;

    public AdapterDemografi(ArrayList<Demografi> demografis, Context ctx){
        /**
         * Inisiasi data dan variabel yang akan digunakan
         */
        daftarDemografi = demografis;
        context = ctx;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        /**
         * Inisiasi View
         * Di tutorial ini kita hanya menggunakan data String untuk tiap item
         * dan juga view nya hanyalah satu TextView
         */
        TextView tvJk;
        TextView tvUsia;
        TextView tvPendidikan;
        TextView tvPekerjaan;
        TextView tvEmail;


        ViewHolder(View v) {
            super(v);
            tvJk = (TextView) v.findViewById(R.id.textViewJk);
            tvUsia = (TextView) v.findViewById(R.id.textViewUsia);
            tvPendidikan = (TextView) v.findViewById(R.id.textViewPend);
            tvPekerjaan = (TextView) v.findViewById(R.id.textViewJob);
            tvEmail = (TextView) v.findViewById(R.id.textViewEmail);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /**
         *  Inisiasi ViewHolder
         */
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_demografi_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        /**
         *  Menampilkan data pada view
         */
        final String email = daftarDemografi.get(position).getEmail();
        final String jk = daftarDemografi.get(position).getJk();
        final String usia = daftarDemografi.get(position).getUsia();
        final String pendidikan = daftarDemografi.get(position).getPendidikan();
        final String pekerjaan = daftarDemografi.get(position).getPekerjaan();


        holder.tvEmail.setText(email);
        holder.tvJk.setText(jk);
        holder.tvUsia.setText(usia);
        holder.tvPendidikan.setText(pendidikan);
        holder.tvPekerjaan.setText(pekerjaan);

    }

    @Override
    public int getItemCount() {
        /**
         * Mengembalikan jumlah item pada barang
         */
        return daftarDemografi.size();
    }
}