package com.shajidurrahman.whatsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SIgnUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        this.getSupportActionBar().hide();
        this.setTitleColor(android.R.color.holo_blue_light);
    }
}