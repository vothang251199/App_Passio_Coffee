package com.example.app_passio_coffee.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.app_passio_coffee.fragmet.Fragment_ChuaSuDung;
import com.example.app_passio_coffee.fragmet.Fragment_DaHetHan;
import com.example.app_passio_coffee.fragmet.Fragment_DaSuDung;
import com.example.app_passio_coffee.fragmet.Fragment_Level_Gold;
import com.example.app_passio_coffee.fragmet.Fragment_Level_Platinum;
import com.example.app_passio_coffee.fragmet.Fragment_Level_Sliver;

public class AdapterViewPagerLevel extends FragmentStatePagerAdapter {
    public AdapterViewPagerLevel(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_Level_Sliver();
            case 1:
                return new Fragment_Level_Gold();
            case 2:
                return new Fragment_Level_Platinum();
            default:
                return new Fragment_Level_Sliver();
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
                title = "Sliver";
                break;
            case 1:
                title = "Gold";
                break;
            case 2:
                title = "Platinum";
                break;
        }
        return title;
    }
}
