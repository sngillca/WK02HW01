package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        if (getIntent().hasExtra("xyz")) {
            TextView tv = (TextView) findViewById(R.id.welcome);
            String text = getIntent().getExtras().getString("xyz");
            tv.setText("Welcome "+text);
        } else {
            Toast toast;
        }
    }

}
