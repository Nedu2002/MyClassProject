package com.example.myclassproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void playBtn1(View v) {

        int rId = v.getId();
        String actiual_Id - v.getResources() .getResourceEntryName(rId);
        int imageId = getResopurces().getIdentifier(actiual_Id, "drawable","com.example.myclassproject")

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.hair1);
    }

    private javax.swing.table.TableColumn getResopurces() {
    }


    public void playBtn2(View v) {


        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.hair2);
    }

    public void playBtn3(View v) {

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.redlongwig);
    }

    public void playBtn4(View v) {

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.redlongwig);
    }
}