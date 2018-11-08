package com.shofi.perantaraadmin;

import java.io.Serializable;

public class Demografi implements Serializable {

    private String jk;
    private String usia;
    private String pendidikan;
    private String pekerjaan;
    private String email;
    private String key;

    public Demografi() {

    }

    public Demografi(String jk, String usia, String pendidikan, String pekerjaan, String email){
        this.jk = jk;
        this.usia = usia;
        this.pendidikan = pendidikan;
        this.pekerjaan = pekerjaan;
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " "+jk+"\n" +
                " "+usia +"\n" +
                " "+pendidikan +"\n" +
                " "+pekerjaan +"\n" +
                " "+email;
    }

}
