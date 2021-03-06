package com.teamflybd.nougatbatchgithub;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

/*
Nougat batch
Acticity lifecycle
28 May 2018

BackPress
Menus
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Action bar*/
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        /** ActionBar */
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


    /*Adding functionality to back button*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    /*Single tap to exit*/
//    @Override
//    public void onBackPressed() {
//
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_HOME);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(intent);
//    }

    /*Double tap to exit*/
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
