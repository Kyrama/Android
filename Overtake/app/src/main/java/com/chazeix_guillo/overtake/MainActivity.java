package com.chazeix_guillo.overtake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private TextView textView;

    private SensorManager sensorManager;
    private Sensor gyro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        gyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textSensor);
        System.out.println("SDMJBSQMDFKGBZRKEMBMJLKERGBMKJREGBMERZGBQMKJGBQMLKGJRNRGBRGKJBGLQKG");
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        System.out.println("X : "+event.values[sensorManager.AXIS_X]+"\nY : "+event.values[sensorManager.AXIS_Y]+"\nZ : "+event.values[sensorManager.AXIS_Z]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
