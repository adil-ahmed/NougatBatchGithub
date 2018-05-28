package com.teamflybd.nougatbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/*
Nougat batch
Acticity lifecycle
28 May 2018
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("I am in :", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("I am in :", "onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("I am in :", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("I am in :", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("I am in :", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("I am in :", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("I am in :", "onDestroyed");
    }
}
