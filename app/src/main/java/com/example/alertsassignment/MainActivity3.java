package com.example.alertsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        log.setOnClickListener(findViewById(R.id.Button2));
        startActivity(new Intent(MainActivity3.this,MainActivity.class));
    }
}