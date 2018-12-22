package com.example.azr.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Team teamA;
    Team teamB;

    MainActivity() {
        teamA = new Team();
        teamB = new Team();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view, Team teamObj) {

    }
}
