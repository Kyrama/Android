package com.chazeix_guillo.overtake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

public class Gyro implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor gyro;

    public Gyro(SensorManager sensorManager){
        this.sensorManager = sensorManager;
        gyro = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        if(gyro == null){
            Log.d("bat","no gyro");
        }

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        MainActivity.gyroscopeValue = event.values[2];
        Log.d("bat",Float.toString(event.values[2]));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    public void onResume() {
        sensorManager.registerListener(this,gyro,SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void onPause() {
        sensorManager.unregisterListener(this);
    }
}
