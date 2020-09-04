package com.example.chapterone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        // get data from upper activity
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d(TAG, data);

        // send data back to upper activity

        Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open default browser
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.google.com"));
                //Intent intent = new Intent(Intent.ACTION_DIAL);//MAKE PHONE CALL
                //intent.setData(Uri.parse("tel:10086");//Protocol is tel

                // <intent-filter>-<data> => determine what we could respond
                // android:scheme(protocol, e.g. http)
                // android:host/port/path/mimeType
                // startActivity(intent);

                Intent intent = new Intent();// This intent is only for passing data
                intent.putExtra("data_return", "Hello boss");
                setResult(RESULT_OK, intent);// pass data to upper activity (RESULT_OK/RESULT_CANCELED, intent)
                finish();

            }
        });

    }
}