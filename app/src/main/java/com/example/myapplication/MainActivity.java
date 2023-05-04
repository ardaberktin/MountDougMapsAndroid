package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchWindow(View v){

        Button b = (Button)v;

        String buttonName = b.getText().toString();

        char s1 = buttonName.charAt(4);
        char s2 = buttonName.charAt(5);
        char s3 = buttonName.charAt(6);

        String newNum = new StringBuilder().append(s2).append(s3).toString();

       Log.d("try", newNum);
        int i = Integer.parseInt(newNum);

        //To-do
        //fix numbers of the maps - Done-
        //make first and second floor map - Done-
        //try to change the colour of the buttons -Done-

        if(buttonName.charAt(4) == ('2') ){
            i += 23;
        }

        Intent myIntent = new Intent(this, WindowActivity.class);
        myIntent.putExtra("intVariableName", (i - 1));
        startActivity(myIntent);

    }
    public void launchMap1(View v){
        Intent myIntent = new Intent(this, MapActivity.class);
        myIntent.putExtra("intMapNum", (0));
        startActivity(myIntent);
    }

    public void launchMap2(View v){
        Intent myIntent = new Intent(this, MapActivity.class);
        myIntent.putExtra("intMapNum", (1));
        startActivity(myIntent);
    }

}