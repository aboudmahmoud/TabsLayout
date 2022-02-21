package com.example.tablayoutandviewpager.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayoutandviewpager.Moudle.Tabs.MyTab;

import java.util.ArrayList;

public class PageAdapter extends FragmentStatePagerAdapter {
    ArrayList<MyTab> tabs =new ArrayList<>();
    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addtap(MyTab tab)
    {
        tabs.add(tab);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabs.get(position).getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getCatgroy().getName();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
