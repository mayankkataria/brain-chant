package com.jumayu.brainchant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hbb20.CountryCodePicker;

public class EnterPhone extends AppCompatActivity {

    CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone);

        ccp = findViewById(R.id.ccp);
    }
}
