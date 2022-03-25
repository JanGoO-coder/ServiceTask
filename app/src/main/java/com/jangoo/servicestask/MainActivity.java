package com.jangoo.servicestask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btn1.getId()) {
            startService(new Intent(this, MusicService.class));
        }
        if (view.getId() == btn2.getId()) {
            startActivity(new Intent(this, SecActivity.class));
        }
        if (view.getId() == btn3.getId()) {
            stopService(new Intent(this, MusicService.class));
        }
        if (view.getId() == btn4.getId()) {
            finish();
        }
    }
}