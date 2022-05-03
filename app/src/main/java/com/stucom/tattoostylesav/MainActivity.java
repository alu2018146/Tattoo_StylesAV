package com.stucom.tattoostylesav;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void onClickToSignIn(View v) {
        Intent intent = new Intent(MainActivity.this, ActivitySignIn.class);
        startActivity(intent);
    }

    public void onClickToForgotPassword(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityForgotPassword.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}