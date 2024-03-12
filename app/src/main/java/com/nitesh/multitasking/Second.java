package com.nitesh.multitasking;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);
        e3 = (EditText)findViewById(R.id.editText5);
        e4 = (EditText)findViewById(R.id.editText6);
        e5 = (EditText)findViewById(R.id.editText7);
        b1= (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Second.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                if(s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals(""))
                {
                    Toast.makeText(Second.this,"fill all",Toast.LENGTH_SHORT).show();
                }
                else
                {

                    SQLiteDatabase mydatabase = openOrCreateDatabase("Nitesh",MODE_PRIVATE,null);
                    mydatabase.execSQL("CREATE TABLE IF NOT EXISTS student(name varchar,password varchar,email varchar,city varchar,phone varchar);");
                    String s6 = "select * from student where name ='"+s1+"' and email = '"+s3+"'";
                    // In andriod cursor is a class through we can store the value
                    Cursor cursor = mydatabase.rawQuery(s6,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Second.this,"User already exit",Toast.LENGTH_SHORT);
                        Intent i = new Intent(Second.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        mydatabase.execSQL("INSERT INTO  student VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');");
                        Toast.makeText(Second.this,"Your accout is created  , You have to logged in to Start",Toast.LENGTH_SHORT);
                        Intent k = new Intent(Second.this,MainActivity.class);
                        startActivity(k);
                        finish();
                    }
                }
            }
        });

    }
}
