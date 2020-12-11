package com.example.app_passio_coffee;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_passio_coffee.adapter.AdapterTinTuc;
import com.example.app_passio_coffee.model.TinTuc;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvTinTuc;
    private AdapterTinTuc adapterTinTuc;
    private ImageView imgCoupon, imgChuong, imgDinhVi, imgTheTV;
    private View layoutNameView;
    private FloatingActionButton btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvTinTuc = findViewById(R.id.rcv_tintuc);

        imgCoupon = findViewById(R.id.img_coupon);
        imgCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Coupon.class);
                startActivity(intent);
            }
        });

        imgChuong = findViewById(R.id.img_chuong);
        imgChuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThongBao.class);
                startActivity(intent);
            }
        });

        imgDinhVi = findViewById(R.id.img_dinhvi);
        imgDinhVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DinhVi.class);
                startActivity(intent);
            }
        });

        layoutNameView = findViewById(R.id.layout_name);
        layoutNameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                intent.putExtra("imgCustomer", R.drawable.ic_avatar);
                startActivity(intent);
            }
        });

        imgTheTV = findViewById(R.id.img_thetv);
        imgTheTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TheThanhVien.class);
                startActivity(i);
            }
        });

        btnOrder = findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ChonMon.class);
                startActivity(i);
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        rcvTinTuc.setLayoutManager(gridLayoutManager);
        rcvTinTuc.setFocusable(false);
        rcvTinTuc.setNestedScrollingEnabled(false);
        rcvTinTuc.setAdapter(adapterTinTuc);

        adapterTinTuc.setData(getListTinTuc());
        adapterTinTuc = new AdapterTinTuc();

    }

    private List<TinTuc> getListTinTuc(){
        List<TinTuc> tinTucs = new ArrayList<>();
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        tinTucs.add(new TinTuc(R.drawable.ic_membership1, "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH",
                "GREEN XMAS - MỪNG GIÁNG SINH, MỘT GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến đánh dấu sự..."));
        return tinTucs;
    }
}