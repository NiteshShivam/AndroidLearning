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
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Second.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(MainActivity.this,"fill all",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase mydatabase = openOrCreateDatabase("Nitesh",MODE_PRIVATE,null);
                    mydatabase.execSQL("CREATE TABLE IF NOT EXISTS student(name varchar,password varchar,email varchar,city varchar,phone varchar);");
                    String s3="Select * from student where name = '"+s1+"' and password = '"+s2+"'";
                    Cursor cursor=mydatabase.rawQuery(s3,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(MainActivity.this, "You are Logged In", Toast.LENGTH_SHORT).show();
                        Intent v = new Intent(MainActivity.this,Third.class);
                        startActivity(v);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Sorry Doesn't Find the Account", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
