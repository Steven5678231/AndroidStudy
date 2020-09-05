package com.example.chapterrtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {
    private static final String TAG = "NormalActivity";
    public static void actionStart(Context context, String data1, String data2){
        Intent intent = new Intent(context, NormalActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Intent intent = getIntent();
        String data = intent.getStringExtra("param1");
        Log.d(TAG, "onCreate: "+ data);
    }
}