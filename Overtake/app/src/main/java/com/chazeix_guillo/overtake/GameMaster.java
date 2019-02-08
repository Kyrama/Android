package com.chazeix_guillo.overtake;

import android.widget.TextView;

public class GameMaster {

    public void game(TextView textView) {
        while(true){
            textView.setText(Float.toString(MainActivity.gyroscopeValue));
        }
    }
}
