package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private View Food;
    private View Food01;
    private View Food02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //เมนูอาหาร
        Food = (View) findViewById(R.id.view);
        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
            //ขนมหวาน
        Food01 = (View) findViewById(R.id.view2);
        Food01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
            //เพิ่มเมนูอาหาร
        Food02 = (View) findViewById(R.id.view3);
        Food02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

    }

}


