package com.example.tenlayoutsexercice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Layout5 extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout5);
        btn = findViewById(R.id.button5);
        Toast.makeText(this, "You're halfway there!", Toast.LENGTH_SHORT).show();

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Layout5.this, Frame6.class));
            }
        });}


    @Override
    public void onClick(View v) {

    }
}