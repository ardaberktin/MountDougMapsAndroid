package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MapActivity extends AppCompatActivity {

    private static ImageView image;
    private static Button buttons;
    private int currentImage;
    int[] images = {R.drawable.map_upstairs, R.drawable.map_downstairs,};

    private static int mess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);


        Intent mIntent = getIntent();
        mess = mIntent.getIntExtra("intMapNum", 0);
        changeImage();

    }

    public void changeImage() {

        image = (ImageView) findViewById(R.id.img);
        image.setImageResource(images[mess]);


    }
}

