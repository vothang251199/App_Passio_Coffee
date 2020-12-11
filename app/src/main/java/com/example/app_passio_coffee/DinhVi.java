package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DinhVi extends AppCompatActivity {
    private ImageView imgBackOfDinhVi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh_vi);

        imgBackOfDinhVi = findViewById(R.id.img_back_of_dinhvi);
        imgBackOfDinhVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DinhVi.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}