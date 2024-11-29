package com.exammarcos.examenpmdm;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.exammarcos.examenpmdm.fragments.PrimerFragment;
import com.exammarcos.examenpmdm.fragments.SegundoFragment;
import com.exammarcos.examenpmdm.fragments.TercerFragment;

public class Paginador extends FragmentPagerAdapter {


    private final Context context;
    private final FragmentManager fm;

    public Paginador(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.fm = fm;
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new PrimerFragment();
            case 1:
                return new SegundoFragment();

            case 2:
                return new TercerFragment();
            default:
                return null;
        }    }

    @Override
    public int getCount() {
        return 3;
    }
}
