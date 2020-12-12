package com.example.app_passio_coffee;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.app_passio_coffee.adapter.AdapterMon;
import com.example.app_passio_coffee.adapter.AdapterViewPagerChonMon;
import com.google.android.material.tabs.TabLayout;

public class ChonMon extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mviewPager;
    private ImageView imgBackOfChonMon;
    public static View xemGioHang;
    public static TextView tv_XemGH_TongGia;
    public static TextView tv_XemGH_SoLuong;
    public static ImageView imgRefresh;
    private Dialog dialogHuy;
    public static int bienTg;

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

        imgRefresh = findViewById(R.id.img_refresh);
        imgRefresh.setVisibility(View.GONE);

        //AdapterMon.viewSo.setVisibility(View.VISIBLE);



        xemGioHang = findViewById(R.id.layout_xemgiohang);
        xemGioHang.setVisibility(View.GONE);
        xemGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChonMon.this, GioHang.class);
                i.putExtra("soluongmondat", tv_XemGH_SoLuong.getText().toString());
                i.putExtra("TongGiaDat", tv_XemGH_TongGia.getText().toString());
                startActivity(i);
            }
        });

        tv_XemGH_TongGia = findViewById(R.id.tv_xemgiohang_tonggia);
        tv_XemGH_SoLuong = findViewById(R.id.tv_xemgiohang_soluong);

        AdapterViewPagerChonMon adapterViewPagerChonMon = new AdapterViewPagerChonMon(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(adapterViewPagerChonMon);

        mTabLayout.setupWithViewPager(mviewPager);
    }
}
