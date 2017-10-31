package com.example.martoraneca.topgrossingmovies.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.martoraneca.topgrossingmovies.R;

public class MainActivity extends AppCompatActivity {

    Button mStartBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartBut = (Button) findViewById(R.id.startButton);

    }

    public void nextActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MainMoviesActivity.class);
        finish();
        startActivity(intent);
    }



}