package com.example.app_passio_coffee.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.app_passio_coffee.fragmet.Fragment_ChonMon_Fresh;
import com.example.app_passio_coffee.fragmet.Fragment_ChonMon_Green;
import com.example.app_passio_coffee.fragmet.Fragment_ChonMon_Ice;
import com.example.app_passio_coffee.fragmet.Fragment_ChonMon_Passio;
import com.example.app_passio_coffee.fragmet.Fragment_ChonMon_Tea;

public class AdapterViewPagerChonMon extends FragmentStatePagerAdapter {
    public AdapterViewPagerChonMon(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_ChonMon_Green();
            case 1:
                return new Fragment_ChonMon_Ice();
            case 2:
                return new Fragment_ChonMon_Tea();
            case 3:
                return new Fragment_ChonMon_Passio();
            case 4:
                return new Fragment_ChonMon_Fresh();
            default:
                return new Fragment_ChonMon_Green();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Green xmas";
                break;
            case 1:
                title = "Ice blended";
                break;
            case 2:
                title = "Tea/soda";
                break;
            case 3:
                title = "Passio coffee";
                break;
            case 4:
                title = "Fresh & easy";
                break;
        }
        return title;
    }
}
