package com.example.pranjal.sure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);


        Intent intent =getIntent();
        String name = intent.getStringExtra("name");
        String message = name + "WELCOME TO YOUR AREA";
        welcomeMessage.setText(message);
        etName.setText(name);
    }
}
