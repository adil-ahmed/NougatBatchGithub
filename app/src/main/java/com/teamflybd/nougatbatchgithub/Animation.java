package com.teamflybd.nougatbatchgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

/*
* Animation*/
public class Animation extends AppCompatActivity {

    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        Initilize();

        startMoving();
    }

    private void startMoving() {
        int t = 5000;
        int y = 60;
        int x = 60;

        bt1.animate().translationY(y).translationX(x).setDuration(t).start();
        bt2.animate().translationY(y).translationX(x).setDuration(t).start();
        bt3.animate().translationY(y).translationX(x).setDuration(t).start();
    }

    private void Initilize() {

        bt1 = findViewById(R.id.button3);

        bt2 = findViewById(R.id.button4);

        bt3 = findViewById(R.id.button5);
    }
}
