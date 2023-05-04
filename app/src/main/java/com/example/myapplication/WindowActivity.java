 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

 public class WindowActivity extends AppCompatActivity {

    private static ImageView image;
    private static Button buttons;
    private int currentImage;
    int[] images = {R.drawable.map_1,R.drawable.map_2,R.drawable.map_3,R.drawable.map_4,R.drawable.map_5
            ,R.drawable.map_6,R.drawable.map_107,R.drawable.map_7,R.drawable.map_8,R.drawable.map_9,
            R.drawable.map_10,R.drawable.map_11
            ,R.drawable.map_12,R.drawable.map_13,0,R.drawable.map_14,R.drawable.map_15,R.drawable.map_16
            ,R.drawable.map_17,R.drawable.map_18
            ,R.drawable.map_19,R.drawable.map_20,R.drawable.map_21,R.drawable.map_22,R.drawable.map_23
            ,R.drawable.map_24,0,R.drawable.map_25,R.drawable.map_26,R.drawable.map_27,R.drawable.map_28
            ,R.drawable.map_29,R.drawable.map_30,R.drawable.map_31,R.drawable.map_32,0,R.drawable.map_33,0
            ,R.drawable.map_34,R.drawable.map_35,R.drawable.map_36,R.drawable.map_37,R.drawable.map_38
            ,R.drawable.map_39,R.drawable.map_40,R.drawable.map_41,0,R.drawable.map_42,R.drawable.map_43
            ,R.drawable.map_44};

    private static int mess;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);


        Intent mIntent = getIntent();
        mess = mIntent.getIntExtra("intVariableName", 0);
        changeImage();

    }

     public void changeImage() {

         image = (ImageView)findViewById(R.id.img);
         image.setImageResource(images[mess]);


     }
}