package com.nitesh.multitasking;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fifth extends AppCompatActivity {
Button b1;
ImageButton b2,b3;
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b1 = (Button)findViewById(R.id.button13);
        b2 = (ImageButton) findViewById(R.id.imageButton14);
        b3 = (ImageButton) findViewById(R.id.imageButton15);
        mp = MediaPlayer.create(this,R.raw.r);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                Intent i = new Intent(Fifth.this,Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
    }
}
