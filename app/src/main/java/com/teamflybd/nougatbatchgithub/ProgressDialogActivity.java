package com.teamflybd.nougatbatchgithub;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*Progress dialog
* Menus*/

public class ProgressDialogActivity extends AppCompatActivity {

    Button button;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog);

        /** ActionBar This is back button*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */

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

    /** Creating menu by inflate*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if(id == android.R.id.home)
//        {
//            onBackPressed();
//            //Toast.makeText(getApplicationContext(),"To sign out tap on action bar!",Toast.LENGTH_LONG).show();
//            return true;
//        }

        int id = item.getItemId();

        if( id == R.id.about)
        {
            Toast.makeText(this, "Clicked on about item", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.logout)
        {
            Toast.makeText(this, "Clicked on logout item", Toast.LENGTH_SHORT).show();
        }

        else if(id == android.R.id.home)
        {
           // Toast.makeText(this, "Pressed on back button", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ProgressDialogActivity.this,MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
