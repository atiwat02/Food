package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
        private TextView Cat;
        private ImageView aa;
        private TextView  bb;
        private TextView cc;
        private TextView dd;
        private TextView ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent intent = getIntent();
        DataFood dataFood = (DataFood) intent.getSerializableExtra("data");

       Cat = (TextView)findViewById(R.id.text01);
       Cat.setText(dataFood.getName());

       aa = (ImageView)findViewById(R.id.imageView);
       aa.setImageResource(dataFood.getLmage());

        bb = (TextView) findViewById(R.id.text02);
        bb.setText(dataFood.getName1()
        );

        cc = (TextView) findViewById(R.id.text03);
        cc.setText(dataFood.getData1());

        dd = (TextView) findViewById(R.id.text04);
        dd.setText(dataFood.getName2());

        ee = (TextView) findViewById(R.id.text05);
        ee.setText(dataFood.getData2());




    }
}
