package com.example.app_passio_coffee.fragmet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_passio_coffee.R;
import com.example.app_passio_coffee.adapter.AdapterMon;
import com.example.app_passio_coffee.model.Mon;

import java.util.ArrayList;
import java.util.List;


public class Fragment_ChonMon_Passio extends Fragment {

    private RecyclerView mRecyclerView;
    private AdapterMon adapterMon;
    private View mView;

    public Fragment_ChonMon_Passio() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView =  inflater.inflate(R.layout.fragment_chonmon_passio, container, false);

        mRecyclerView = mView.findViewById(R.id.rcv_chonmon_passio);
        adapterMon = new AdapterMon();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setFocusable(false);
        mRecyclerView.setNestedScrollingEnabled(false);

        adapterMon.setData(getListMon());
        mRecyclerView.setAdapter(adapterMon);
        return mView;
    }
    private List<Mon> getListMon(){
        List<Mon> monList = new ArrayList<>();
        monList.add(new Mon(R.drawable.ic_drink_test, "Passiopuccino", "36.000đ"));
        monList.add(new Mon(R.drawable.ic_drink_test, "Cookie'n Cream", "39.000đ"));
        monList.add(new Mon(R.drawable.ic_drink_test, "Matcha Green Tea", "49.000đ"));
        monList.add(new Mon(R.drawable.ic_drink_test, "Iced Chôclate", "44.000đ"));
        monList.add(new Mon(R.drawable.ic_drink_test, "PassioChoco", "39.000đ"));
        monList.add(new Mon(R.drawable.ic_drink_test, "Passiopuccino With Caramel", "46.000đ"));

        return monList;
    }
}