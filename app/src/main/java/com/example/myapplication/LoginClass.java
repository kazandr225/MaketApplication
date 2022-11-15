package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_class);
    }
    public  void log(View v)
    {
        startActivity (new Intent(this, MainActivity.class));
    }
    public  void reg(View v)
    {
        startActivity (new Intent(this, RegistrationClass.class));
    }
}