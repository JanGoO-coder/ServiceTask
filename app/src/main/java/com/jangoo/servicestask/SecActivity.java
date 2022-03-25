package com.jangoo.servicestask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        btnClose = findViewById(R.id.closeBtn);
        btnClose.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btnClose.getId()) {
            finish();
        }
    }
}