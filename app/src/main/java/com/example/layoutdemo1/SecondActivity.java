package com.example.layoutdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

         Intent intent = getIntent();

         Log.d("name", intent.getStringExtra("name"));
         Log.d("email", intent.getStringExtra("email"));
         Log.d("mobile", intent.getStringExtra("mobile"));
         Log.d("address", intent.getStringExtra("address"));
    }
}