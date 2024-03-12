package com.nitesh.multitasking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Eleven extends AppCompatActivity {

    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        b1 = (Button)findViewById(R.id.button28);
        r1 = (RadioButton)findViewById(R.id.radioButton9);
        r2 = (RadioButton)findViewById(R.id.radioButton10);
        r3 = (RadioButton)findViewById(R.id.radioButton11);
        r4 = (RadioButton)findViewById(R.id.radioButton12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.isChecked())
                {
                    ++Nine.scrore;
                }
                else
                {
                    --Nine.scrore;
                }
                Intent j = new Intent(Eleven.this,Twelve.class);
                startActivity(j);
                finish();
            }
        });

    }
}
