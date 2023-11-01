package com.example.alertsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signup,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      signup= findViewById(R.id.button);
      login= findViewById(R.id.button1);



        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);

// Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

myEdit.putString("number","03056362248");
myEdit.apply();
        startActivity(new Intent(MainActivity.this, MainActivity2.class));

    }
});
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, sharedPreferences.getString("number",""), Toast.LENGTH_SHORT).show();
    }
});
    }



}




