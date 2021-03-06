package com.millenialzdev.whatsapp_tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabItem tabChat, tabStatus, tabPaggilan;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        tabChat = findViewById(R.id.tabChat);
        tabStatus = findViewById(R.id.tabStatus);
        tabPaggilan= findViewById(R.id.tabPanggilan);
        viewPager= findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("WhatsApp");
        }
    }
}