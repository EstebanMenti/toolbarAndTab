package com.example.tab.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tab.Fragments.FirstFragment;
import com.example.tab.Fragments.SecondFragment;
import com.example.tab.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numerOfTab;



    public PagerAdapter(FragmentManager fm, int numerOfTab) {
        super(fm);
        this.numerOfTab = numerOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return numerOfTab;
    }
}
