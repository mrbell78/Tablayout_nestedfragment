package com.example.tablayoutinnestedfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class Pageadapter extends FragmentPagerAdapter {

    private int noOftab;

    Pageadapter(FragmentManager fm, int noOftab){
        super(fm);
        this.noOftab=noOftab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallFragment();
                default:return null;

        }

    }

    @Override
    public int getCount() {
        return noOftab;
    }
}
