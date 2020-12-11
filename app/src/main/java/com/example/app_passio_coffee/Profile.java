package com.example.app_passio_coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {
    private ImageView imgAvata, imgBackOfProfile;
    private View layoutCPofToi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgAvata = findViewById(R.id.img_avta_profile);
        Bundle bundle = getIntent().getExtras();
        int img = bundle.getInt("imgCustomer");
        imgAvata.setImageResource(img);

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
    }
}