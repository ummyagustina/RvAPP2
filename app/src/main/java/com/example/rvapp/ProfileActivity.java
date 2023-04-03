package com.example.rvapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {
    ImageView img;
    TextView text, sosmed;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        img=(ImageView)findViewById(R.id.img);
        text=(TextView)findViewById(R.id.text);
        sosmed=(TextView)findViewById(R.id.sosialmedia);


        img.setImageResource(getIntent().getIntExtra("image", 0));
        text.setText(getIntent().getStringExtra("username"));
        sosmed.setText(getIntent().getStringExtra("sosialmedia"));
    }
}