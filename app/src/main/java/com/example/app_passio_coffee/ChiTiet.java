package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChiTiet extends AppCompatActivity {
    private ImageView imgBackOfChiTiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

        imgBackOfChiTiet = findViewById(R.id.img_back_of_chitiet);
        imgBackOfChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChiTiet.super.onBackPressed();
            }
        });
    }
}