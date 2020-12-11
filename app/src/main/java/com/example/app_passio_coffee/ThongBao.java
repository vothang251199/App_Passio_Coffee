package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThongBao extends AppCompatActivity {
    private ImageView imgBackOfThongBao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);

        imgBackOfThongBao = findViewById(R.id.img_back_of_thongbao);
        imgBackOfThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongBao.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}