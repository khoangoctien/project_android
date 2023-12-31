package com.example.managementprofile.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behaviorResumeOnlyCurrentFragment) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FragmentProfile();
            case 1: return new FragmentLearn();
            case 2: return new FragmentWork();
            case 3: return new FragmentAchivement();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
