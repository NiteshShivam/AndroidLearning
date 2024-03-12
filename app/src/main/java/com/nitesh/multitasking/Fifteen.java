package com.nitesh.multitasking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Fifteen extends AppCompatActivity {
    Button b1;
    EditText e1;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        b1 = (Button)findViewById(R.id.button35);
        e1 = (EditText)findViewById(R.id.editText2);
        wv = (WebView)findViewById(R.id.web);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fifteen.this,Fourteen.class);
                startActivity(i);
                finish();
            }
        });

        wv.loadUrl(Fourteen.s);

    }
}
