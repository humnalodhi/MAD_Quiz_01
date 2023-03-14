package com.example.mad_quiz_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Activity1(View view) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }

    public void Activity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void Activity4(View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void Activity3(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}