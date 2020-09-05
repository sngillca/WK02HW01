package com.example.wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<String, String> users = new HashMap<>();

    Button btn;
    EditText ET_name, ET_pword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users.put("alice","otter123");
        users.put("ben","jerry000");
        users.put("elon","tusk");
        btn = (Button) findViewById(R.id.btn_Login);
        ET_name = findViewById(R.id.ET_UName);
        ET_pword = findViewById(R.id.ET_PWord);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( users.containsKey(ET_name.getText().toString()) && users.get(ET_name.getText().toString()).equals(ET_pword.getText().toString())) {
                    Intent intent = new Intent(getApplicationContext(), LandingPage.class);
                    intent.putExtra("xyz", ET_name.getText().toString());
                    startActivity(intent);
                } else {
                    makeToast();

                }


            }
        });
    }
    public void makeToast() {
        Context context = getApplicationContext();
        CharSequence text = "username and password are incorrect";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void makeToast2() {
        Context context = getApplicationContext();
        CharSequence text = "username is incorrect";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void makeToast3() {
        Context context = getApplicationContext();
        CharSequence text = "password is incorrect";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
