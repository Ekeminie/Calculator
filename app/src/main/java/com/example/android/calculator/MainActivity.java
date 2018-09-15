package com.example.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent;
        if(view.getId()==R.id.standardCalc){
        intent = new Intent(getApplicationContext(), StandardCalculator.class);
        startActivity(intent);
        }


    }

}
