package com.example.android.mymiwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jdickey on 7/8/2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter{

    public CategoryAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new PhraseFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
