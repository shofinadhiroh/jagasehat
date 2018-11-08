package com.shofi.uascihuy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SaliraPagerAdapter extends FragmentPagerAdapter {

    public SaliraPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        /** Show a Fragment based on the position of the current screen */
        if (position == 0) {
            return new Fragment1Apaitu();
        }else if (position == 1){
            return new Fragment2Mengapa();
        }else if (position == 2){
            return new Fragment3Salira();
        }else if (position == 3){
            return new Fragment4Cegah();
        }else if (position == 4){
            return new Fragment5Pengobatan();
        }else
            return new Fragment6Youarenotalone();
    }

    @Override
    public int getCount() {

        return 6;
    }
}
