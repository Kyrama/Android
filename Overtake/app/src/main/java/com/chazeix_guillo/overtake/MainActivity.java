package com.chazeix_guillo.overtake;

import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    private TextView textView;

    public static float gyroscopeValue = 0f;

    private GameMaster gameMaster;

    private Gyro gyroscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("bat","DEBUT CREATE/");

        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textSensor);

//        gameMaster = new GameMaster();

        gyroscope = new Gyro((SensorManager)getSystemService(SENSOR_SERVICE));

        Log.d("bat","FIN CREATE/");
    }

    @Override
    protected void onResume() {
        super.onResume();
        gyroscope.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscope.onPause();
    }
}
