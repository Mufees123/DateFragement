package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1=findViewById(R.id.button);
         b2=findViewById(R.id.button2);
      b1.setOnClickListener(this);
      b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if (view == b1) {
            startService(new Intent(this, Player.class));
        } else if (view == b2) {
            stopService(new Intent(this, Player.class));
        }
    }

    }
