package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LogClass extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.log);
        }
    public  void log(View v)
    {
        //startActivity (new Intent(this, MainActivity.class));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

