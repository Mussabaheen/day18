package com.example.mussabaheenmalik.screen;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TabLayout tbt1;
    ViewPager vpv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbt1 = (TabLayout)findViewById(R.id.view1);
        vpv1 = (ViewPager)findViewById(R.id.pager1);
        vpv1.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        tbt1.setupWithViewPager(vpv1);
        tbt1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpv1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    class PagerAdapter extends FragmentPagerAdapter
    {
        String data[]= {"java","Andriod","Ios"};

        public PagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0)
            {
                return new java();
            }
            if(position==1)
            {
                return new java2();
            }
            if(position==2)
            {
                return new java3();

            }
            return  null;
        }

        @Override
        public int getCount() {

            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }


}
