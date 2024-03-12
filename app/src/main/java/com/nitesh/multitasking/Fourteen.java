package com.nitesh.multitasking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fourteen extends AppCompatActivity {
 Button b1,b2,b3,b4;
 static  String s;
 EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        t1 = (EditText) findViewById(R.id.textView4);
        b1 = (Button)findViewById(R.id.button31);
        b2 = (Button)findViewById(R.id.button32);
        b3 = (Button)findViewById(R.id.button33);
        b4 = (Button)findViewById(R.id.button34);
        t1.setText("Scroe is "+Nine.scrore);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = "https://www.facebook.com/";
                Intent i = new Intent(Fourteen.this,Fifteen.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = "https://twitter.com/";
                Intent j = new Intent(Fourteen.this,Fifteen.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s ="https://www.netcamp.in/";
                Intent k = new Intent(Fourteen.this,Fifteen.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Fourteen.this,Third.class);
                startActivity(l);
                finish();
            }
        });
    }
}
