package com.example.myclassproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.CookieHandler;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void showBtn1(View v) {

        int rId = v.getId();
        String actual_Id = v.getResources() .getResourceEntryName(rId);
        int imageId = getResources() .getIdentifier(actual_Id, "drawable", "com.example.MyClassProject");

        Toast.makeText(this, "you clicked" +actual_Id, Toast.LENGTH_SHORT).show();

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.hair1);

    }

    public void homeBtn(View v) {

        Intent home = new Intent(Main2Activity.this, MainActivity.class);
        CookieHandler users;
        //profile.putExtra("UserName", users.get(product));

        startActivity(home);



    }

}