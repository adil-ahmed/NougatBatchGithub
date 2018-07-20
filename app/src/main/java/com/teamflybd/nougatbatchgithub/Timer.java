package com.teamflybd.nougatbatchgithub;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 14 July
 Android timer
 */
public class  Timer extends AppCompatActivity {

    Button timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        timer = findViewById(R.id.timer);


//        new CountDownTimer(10000, 1000) {
//
//            public void onTick(long millisecondsUntilDone) {
//
//                // Coundown is counting down (every second)
//
//                Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));
//
//            }
//
//
//            public void onFinish() {
//                // Counter is finished! (after 10 seconds)
//
//                Log.i("Done!", "Coundown Timer Finished");
//
//            }
//
//        }.start();



         final Handler handler = new Handler();

        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runnable run = new Runnable() {
                    @Override
                    public void run() {

                        // Insert code to be run every second

                        Log.i("Runnable has run!", "10 seconds passed...");
                        Toast.makeText(Timer.this, "Button pressed and toast showed after 10 seconds", Toast.LENGTH_SHORT).show();

                        handler.postDelayed(this, 10000);

                    }
                };

                handler.post(run);
            }
        });

    }



}




