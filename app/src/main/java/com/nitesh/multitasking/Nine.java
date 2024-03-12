package com.nitesh.multitasking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Nine extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;
    static int scrore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        b1 = (Button)findViewById(R.id.button26);
        r1 = (RadioButton)findViewById(R.id.radioButton1);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrore =0;
                if(r1.isChecked())
                {
                    ++scrore;
                }
                else {
                    --scrore;
                }
                Intent i = new Intent(Nine.this,Ten.class);
                startActivity(i);
                finish();
            }
        });
    }
}
