package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("text");
            int number = extras.getInt("number");
            // Do something with the name and number
        }

    }
}