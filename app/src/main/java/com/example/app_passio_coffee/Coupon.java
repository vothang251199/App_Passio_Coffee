package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;

import com.example.app_passio_coffee.adapter.AdapterViewPagerCoupon;
import com.google.android.material.tabs.TabLayout;

public class Coupon extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private ImageView imgBackofCoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);

        mviewPager = findViewById(R.id.view_pager_coupon);
        mTabLayout = findViewById(R.id.tab_layout_coupon);
        imgBackofCoupon = findViewById(R.id.img_back_of_coupon);

        imgBackofCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coupon.super.onBackPressed();
            }
        });

        AdapterViewPagerCoupon adapterViewPagerCoupon = new AdapterViewPagerCoupon(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(adapterViewPagerCoupon);

        mTabLayout.setupWithViewPager(mviewPager);
    }


}