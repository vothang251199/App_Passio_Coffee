package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private ImageView imgAvata, imgBackOfProfile;
    private View layoutCPofToi, viewToThetv, viewTTCN;
    TextView tv_DangXuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgAvata = findViewById(R.id.img_avta_profile);


        layoutCPofToi = findViewById(R.id.layout_cp_of_toi);
        layoutCPofToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile.this, Coupon.class);
                startActivity(i);
            }
        });

        imgBackOfProfile = findViewById(R.id.img_back_of_profile);
        imgBackOfProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile.this, MainActivity.class);
                startActivity(i);
            }
        });

        tv_DangXuat = findViewById(R.id.tv_dang_xuat);
        tv_DangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile.this, Login.class);
                startActivity(i);
            }
        });

        viewToThetv = findViewById(R.id.view_to_thetv);
        viewToThetv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Profile.this, TheThanhVien.class);
                startActivity(i);
            }
        });

        viewTTCN = findViewById(R.id.view_ttcn);


    }
}