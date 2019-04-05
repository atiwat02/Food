package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;


public class Main4Activity extends AppCompatActivity {

    private TextView OOP;
    private Button button;
    private EditText editText2;
    Firebase myfirebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        OOP =(TextView)findViewById(R.id.OOP);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);

        Firebase.setAndroidContext(this);
        myfirebase = new Firebase ("https://java-51da8.firebaseio.com");





        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase Mynew = myfirebase.child(editText2.getText().toString());
                Mynew.setValue(editText2.getText().toString());
                OOP.setText(editText2.getText());
                editText2.setText("");
            }
        }));

    }

}
