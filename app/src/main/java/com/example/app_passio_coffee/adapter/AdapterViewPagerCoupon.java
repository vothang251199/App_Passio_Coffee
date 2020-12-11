package com.example.app_passio_coffee.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.app_passio_coffee.fragmet.Fragment_ChuaSuDung;
import com.example.app_passio_coffee.fragmet.Fragment_DaHetHan;
import com.example.app_passio_coffee.fragmet.Fragment_DaSuDung;

public class AdapterViewPagerCoupon extends FragmentStatePagerAdapter {
    public AdapterViewPagerCoupon(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_ChuaSuDung();
            case 1:
                return new Fragment_DaSuDung();
            case 2:
                return new Fragment_DaHetHan();
            default:
                return new Fragment_ChuaSuDung();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Chưa sử dụng";
                break;
            case 1:
                title = "Đã sử dụng";
                break;
            case 2:
                title = "Đã hết hạn";
                break;
        }
        return title;
    }
}
