package com.example.tablayoutinnestedfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    PagerAdapter adapter;
    Toolbar mToolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    TabItem itemchat;
    TabItem itemstatus;
    TabItem itemcall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar=findViewById(R.id.maintoolbar);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);


        itemchat=findViewById(R.id.chattab);
        itemstatus=findViewById(R.id.tabstatus);
        itemcall=findViewById(R.id.calltab);


        adapter=new Pageadapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




    }
}
