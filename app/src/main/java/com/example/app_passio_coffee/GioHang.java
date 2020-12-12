package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_passio_coffee.adapter.AdapterGioHang;
import com.example.app_passio_coffee.adapter.AdapterMon;
import com.example.app_passio_coffee.model.ItemGioHang;

import java.util.ArrayList;
import java.util.List;

public class GioHang extends AppCompatActivity {
    private RecyclerView rcvItemGioHang;
    private AdapterGioHang adapterGioHang;
    private ImageView imgBackOfGioHang;
    TextView tvSoLuongMonDat, tvGiaTamTinh, tvGiamGia, tvPhiShip, tvTongGiaGH, tvTongGiaDat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);

        imgBackOfGioHang = findViewById(R.id.img_back_of_giohang);
        imgBackOfGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GioHang.super.onBackPressed();
            }
        });

        Bundle bundle = getIntent().getExtras();

        tvSoLuongMonDat = findViewById(R.id.tv_soluong_mon_dat);
        tvSoLuongMonDat.setText(tvSoLuongMonDat.getText() + " (" + bundle.getString("soluongmondat") + ")");

        tvGiaTamTinh = findViewById(R.id.tv_gh_tamtinh);
        tvGiaTamTinh.setText(bundle.getString("TongGiaDat"));

        tvGiamGia = findViewById(R.id.tv_gh_tiengiam);
        tvPhiShip = findViewById(R.id.tv_gh_phigiaohang);
        tvTongGiaGH = findViewById(R.id.tv_gh_tonggia);
        tvTongGiaDat = findViewById(R.id.tv_gh_tonggiadat);

        int giamgia = Integer.parseInt(tvGiamGia.getText().toString().substring(tvGiamGia.getText().toString().indexOf('0'), tvGiamGia.getText().toString().indexOf('đ')));
        int phiship = Integer.parseInt(tvPhiShip.getText().toString().substring(0, tvPhiShip.getText().toString().indexOf('.')));
        int tamtinh = Integer.parseInt(tvGiaTamTinh.getText().toString().substring(0, tvGiaTamTinh.getText().toString().indexOf('.')));

        tvTongGiaGH.setText((tamtinh + giamgia + phiship) +".000đ");
        tvTongGiaDat.setText((tamtinh + giamgia + phiship) +".000đ");

        rcvItemGioHang = findViewById(R.id.rcv_item_giohang);

        adapterGioHang = new AdapterGioHang();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvItemGioHang.setLayoutManager(linearLayoutManager);

        adapterGioHang.setData(getListItemGh());
        rcvItemGioHang.setAdapter(adapterGioHang);

    }
    private List<ItemGioHang>  getListItemGh(){


        return AdapterMon.monDatHang;
    }
}