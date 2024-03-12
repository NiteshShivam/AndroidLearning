package com.nitesh.multitasking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Six extends AppCompatActivity {

    EditText e1, e2;
    EditText t1;
    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        e1 = (EditText) findViewById(R.id.editText8);
        e2 = (EditText) findViewById(R.id.editText9);
        b1 = (Button) findViewById(R.id.button16);
        b2 = (Button) findViewById(R.id.button17);
        b3 = (Button) findViewById(R.id.button18);
        b4 = (Button) findViewById(R.id.button19);
        b5 = (Button) findViewById(R.id.button20);
        t1 = (EditText) findViewById(R.id.textView7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Six.this, Third.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* value1= Float.parseFloat(e1.getText()+"");
                value2= Float.parseFloat(e2.getText() + "");
                t1.setText((value1+value2)+"");*/
                double oper1 = Double.parseDouble(e1.getText().toString());
                double oper2 = Double.parseDouble(e2.getText().toString());
                double result = oper1 +oper2;
                t1.setText(Double.toString(result));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
//                                      value1= Float.parseFloat(e1.getText() + "");
//                                      value2= Float.parseFloat(e2.getText() + "");
//                                      t1.setText((value1-value2)+"");
                                      double oper1 = Double.parseDouble(e1.getText().toString());
                                      double oper2 = Double.parseDouble(e2.getText().toString());
                                      double result = oper1 - oper2;
                                      t1.setText(Double.toString(result));
                                  }
                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = Double.parseDouble(e1.getText().toString());
                double oper2 = Double.parseDouble(e2.getText().toString());

                try {
                    double result = oper1/oper2;
                    t1.setText(Double.toString(result));
                }
                catch (ArithmeticException e)
                {
                    Toast.makeText(Six.this,"Error ",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1 = Double.parseDouble(e1.getText().toString());
                double oper2 = Double.parseDouble(e2.getText().toString());
                double result = oper1 * oper2;
                t1.setText(Double.toString(result));
            }
        });

    }
}
