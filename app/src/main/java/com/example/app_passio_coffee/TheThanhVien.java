package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_passio_coffee.adapter.AdapterViewPagerCoupon;
import com.example.app_passio_coffee.adapter.AdapterViewPagerLevel;
import com.google.android.material.tabs.TabLayout;

public class TheThanhVien extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private ImageView imgBackofTheTV;
    private TextView tvXemCoupon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_thanh_vien);

        mviewPager = findViewById(R.id.view_pager_thetv);
        mTabLayout = findViewById(R.id.tab_layout_thetv);

        imgBackofTheTV = findViewById(R.id.img_back_of_thetv);
        imgBackofTheTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TheThanhVien.super.onBackPressed();
            }
        });

        tvXemCoupon = findViewById(R.id.tv_thetv_coupon);
        tvXemCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TheThanhVien.this, Coupon.class);
                startActivity(i);
            }
        });

        AdapterViewPagerLevel adapterViewPagerLevel = new AdapterViewPagerLevel(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(adapterViewPagerLevel);

        mTabLayout.setupWithViewPager(mviewPager);
    }
}