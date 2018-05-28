package com.teamflybd.nougatbatchgithub;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*Progress dialog*/

public class ProgressDialogActivity extends AppCompatActivity {

    Button button;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);

        //Typecasting does not require in updated version of android studio
        button = findViewById(R.id.button);
        progressDialog = new ProgressDialog(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               progressDialog.setTitle("Loading.......");
               progressDialog.show();
            }
        });




    }
}
