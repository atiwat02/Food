package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView v01;
    private ImageView v02;
    private TextView  v03;
    private TextView v04;
    private TextView v05;
    private TextView v06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        DataFood dataFood = (DataFood) intent.getSerializableExtra("data");

        v01 = (TextView)findViewById(R.id.TO01);
        v01.setText(dataFood.getName());

        v02 = (ImageView)findViewById(R.id.TO02);
        v02.setImageResource(dataFood.getLmage());

        v03 = (TextView) findViewById(R.id.TO03);
        v03.setText(dataFood.getName1()
        );

        v04 = (TextView) findViewById(R.id.TO04);
        v04.setText(dataFood.getData1());

        v05= (TextView) findViewById(R.id.TO05);
        v05.setText(dataFood.getName2());

        v06= (TextView) findViewById(R.id.TO06);
        v06.setText(dataFood.getData2());
    }
}
