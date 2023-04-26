package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String text = extras.getString("text");
            int number = extras.getInt("number");

            //Set text for first textView
            TextView textString = findViewById(R.id.secondTextString);
            textString.setText(text);

            //Set int for second textView (number had to be converted)
            String test = String.valueOf(number);
            TextView passInt = findViewById(R.id.secondTextNumber);
            passInt.setText(test);

        }

    }
}