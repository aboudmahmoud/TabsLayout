package com.example.tablayoutandviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tablayoutandviewpager.Adapter.PageAdapter;
import com.example.tablayoutandviewpager.Fragment.CatgroyFragment;
import com.example.tablayoutandviewpager.Moudle.Catgroy;
import com.example.tablayoutandviewpager.Moudle.Tabs.MyTab;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabLayout_MAIN);
        viewPager=findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);

        PageAdapter pageAdapter=PageAdapterOpratare();
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
             //   Toast.makeText(getBaseContext(),"You Selec a tap",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
              //  Toast.makeText(getBaseContext(),"You Unselected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
             //   Toast.makeText(getBaseContext(),"YouReselected",Toast.LENGTH_SHORT).show();
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Toast.makeText(getBaseContext(),"onPageScrolled",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getBaseContext(),"onPageSelected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Toast.makeText(getBaseContext(),"onPageScrollStateChanged",Toast.LENGTH_SHORT).show();
            }
        });
    }

    PageAdapter PageAdapterOpratare()
    {
        PageAdapter pageAdapter=new PageAdapter(getSupportFragmentManager());
        Catgroy catgroy1= new Catgroy(1,"Action");
        Catgroy catgroy2= new Catgroy(2,"Drama");
        Catgroy catgroy3= new Catgroy(3,"Romantic");
        Catgroy catgroy4= new Catgroy(4,"Comdey");
        pageAdapter.addtap(new MyTab(catgroy1,CatgroyFragment.newInstance(1,"Action")));
        pageAdapter.addtap(new MyTab(catgroy2,CatgroyFragment.newInstance(2,"Drama")));
        pageAdapter.addtap(new MyTab(catgroy3,CatgroyFragment.newInstance(3,"Romantic")));
        pageAdapter.addtap(new MyTab(catgroy4,CatgroyFragment.newInstance(4,"Comdey")));
        return pageAdapter;
    }
}