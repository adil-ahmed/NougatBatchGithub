package com.teamflybd.nougatbatchgithub;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/*
02 June 2018
* Intent call
* Drawable resource file
* Animation
**/
public class IntentCall extends AppCompatActivity {

    ImageButton button;
    EditText phoneNumber;

    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_call);

        button = findViewById(R.id.button2);
        phoneNumber = findViewById(R.id.phone_number);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = phoneNumber.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+ number));
                if(ActivityCompat.checkSelfPermission(IntentCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                startActivity(intent);
            }
        });
    }
}
