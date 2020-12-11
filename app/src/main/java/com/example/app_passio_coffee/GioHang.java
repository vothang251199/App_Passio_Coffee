package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.app_passio_coffee.adapter.AdapterGioHang;
import com.example.app_passio_coffee.model.ItemGioHang;

import java.util.ArrayList;
import java.util.List;

public class GioHang extends AppCompatActivity {
    private RecyclerView rcvItemGioHang;
    private AdapterGioHang adapterGioHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        rcvItemGioHang = findViewById(R.id.rcv_item_giohang);

        adapterGioHang = new AdapterGioHang();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvItemGioHang.setLayoutManager(linearLayoutManager);

        adapterGioHang.setData(getListItemGh());
        rcvItemGioHang.setAdapter(adapterGioHang);

    }
    private List<ItemGioHang>  getListItemGh(){
        List<ItemGioHang> list = new ArrayList<>();
        list.add(new ItemGioHang(R.drawable.ic_drink_test, "Chocolate", "2", "44.000đ"));
        list.add(new ItemGioHang(R.drawable.ic_drink_test, "Chocolate", "2", "44.000đ"));
        list.add(new ItemGioHang(R.drawable.ic_drink_test, "Chocolate", "2", "44.000đ"));
        list.add(new ItemGioHang(R.drawable.ic_drink_test, "Chocolate", "2", "44.000đ"));

        return list;
    }
}