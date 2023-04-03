package com.example.rvapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> usersList;
    private RecyclerView recyclerView;
    private recyclerAdapter.RecyclerViewClickListener listener;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();
        
        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        recyclerAdapter adapter = new recyclerAdapter(usersList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new recyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onCLick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("username", usersList.get(position).getUsername());
                intent.putExtra("sosmed", usersList.get(position).getPowerrr());
                intent.putExtra("image", usersList.get(position).getImage());
                startActivity(intent);
            }
        };
    }

    private void setUserInfo() {
        usersList.add(new User("appmusic", "music", R.drawable.appmusic));
        usersList.add(new User("facebook", "sosial media", R.drawable.facebook));
        usersList.add(new User("google", "browser", R.drawable.google));
        usersList.add(new User("instagram", "sosial media", R.drawable.instagram));
        usersList.add(new User("kpop", "korea", R.drawable.kpop));
        usersList.add(new User("pop", "pop", R.drawable.pop));
        usersList.add(new User("rock", "music", R.drawable.rock));
        usersList.add(new User("spotify", "music", R.drawable.spotify));
        usersList.add(new User("twitter", "ngakak", R.drawable.twitter));
        usersList.add(new User("weverse", "kpop", R.drawable.weverse));
        usersList.add(new User("whatsapp", "chat", R.drawable.whatsapps));

    }
}