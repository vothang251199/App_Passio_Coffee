package com.example.app_passio_coffee;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.app_passio_coffee.adapter.AdapterViewPagerChonMon;
import com.google.android.material.tabs.TabLayout;

public class ChonMon extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private ImageView imgBackOfChonMon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_mon);

        imgBackOfChonMon = findViewById(R.id.img_back_of_chonmon);
        imgBackOfChonMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChonMon.super.onBackPressed();
            }
        });

        mviewPager = findViewById(R.id.view_pager_chonmon);
        mTabLayout = findViewById(R.id.tab_layout_chonmon);

        AdapterViewPagerChonMon adapterViewPagerChonMon = new AdapterViewPagerChonMon(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(adapterViewPagerChonMon);

        mTabLayout.setupWithViewPager(mviewPager);
    }
}
