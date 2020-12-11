package com.example.app_passio_coffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSDT extends AppCompatActivity {
    private Button btnLoginSDT;
    private ImageView imgBackOfLoginSDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sdt);

        btnLoginSDT = findViewById(R.id.btn_tiep_sdt);
        btnLoginSDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSDT.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imgBackOfLoginSDT = findViewById(R.id.img_back_of_loginsdt);
        imgBackOfLoginSDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginSDT.super.onBackPressed();
            }
        });
    }
}