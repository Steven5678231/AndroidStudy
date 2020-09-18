package com.example.runningman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startRunActivity = (Button) findViewById(R.id.startButton);
        Button startForestActivity = (Button) findViewById(R.id.extendOne);
        Button startPetsActivity = (Button) findViewById(R.id.extendTwo);

        startRunActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RunningActivity.class);
                startActivity(intent);
            }

        });

        startForestActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForestActivity.class);
                startActivity(intent);
            }

        });

        startPetsActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PetsActivity.class);
                startActivity(intent);
            }

        });

    }
}