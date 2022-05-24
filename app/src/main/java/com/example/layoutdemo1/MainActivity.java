package com.example.layoutdemo1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, email, mobile, address;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.phone);
        address = findViewById(R.id.address);

        Button moveBtn = findViewById(R.id.saveBtn);

        moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("mobile", mobile.getText().toString());
                intent.putExtra("address", address.getText().toString());

                startActivity(intent);
            }
        });
    }
}
