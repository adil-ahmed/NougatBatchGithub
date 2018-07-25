package com.teamflybd.nougatbatchgithub;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/*Dynamic layout*/
public class DynamicEditText extends AppCompatActivity {

    //GridLayout mlayout;
    LinearLayout mlayout;
    Button btn;
    DynamicView dv;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_edit_text);


        btn = findViewById(R.id.btn);
        mlayout = findViewById(R.id.grid);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dv = new DynamicView(context);
                mlayout.addView(dv.dEditText(getApplicationContext()),1);
//                mlayout.addView(dv.dEditText(getApplicationContext()),4);
//                mlayout.addView(dv.dEditText(getApplicationContext()),5);


            }
        });
    }
}
