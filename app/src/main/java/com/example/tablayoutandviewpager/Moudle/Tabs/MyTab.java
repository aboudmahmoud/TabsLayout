package com.example.tablayoutandviewpager.Moudle.Tabs;

import androidx.fragment.app.Fragment;

import com.example.tablayoutandviewpager.Moudle.Catgroy;

public class MyTab {
    Catgroy Catgroy;
    Fragment fragment;

    public MyTab(Catgroy catgroy, Fragment fragment) {
        Catgroy = catgroy;
        this.fragment = fragment;
    }

    public Catgroy getCatgroy() {
        return Catgroy;
    }

    public void setCatgroy(Catgroy catgroy) {
        Catgroy = catgroy;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
