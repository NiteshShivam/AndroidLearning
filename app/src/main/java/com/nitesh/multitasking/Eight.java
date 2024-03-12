package com.nitesh.multitasking;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eight extends AppCompatActivity implements SensorEventListener {
        MediaPlayer m1;
        SensorManager sm;
        Sensor s;
        Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
            m1 = MediaPlayer.create(this,R.raw.r);
            sm= (SensorManager)getSystemService(SENSOR_SERVICE);
            s = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
            sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
            b1 = (Button)findViewById(R.id.button25);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    m1.stop();
                    Intent i = new Intent(Eight.this,Third.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        @Override
        public void onSensorChanged(SensorEvent event) {
            if(event.values[0]>3)
            {
                m1.start();
            }
            else
            {
                m1.pause();
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    }

