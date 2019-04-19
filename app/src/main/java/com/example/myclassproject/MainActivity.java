package com.example.myclassproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;;

import java.net.CookieHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playBtn1(View v) {

        Intent product = new Intent(MainActivity.this, Main2Activity.class);
        CookieHandler users;
        //profile.putExtra("UserName", users.get(product));

        startActivity(product);


    }
}