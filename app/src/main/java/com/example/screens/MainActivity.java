package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.buttonHome);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText EditTextMain = findViewById(R.id.EditTextMain);
                String passText = EditTextMain.getText().toString();
                Intent intentNewActivity = new Intent(MainActivity.this,Activity2.class);
                intentNewActivity.putExtra("number", 10);
                intentNewActivity.putExtra("text", passText);
                startActivity(intentNewActivity);

            }
        });
    }
}
