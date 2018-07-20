package com.teamflybd.nougatbatchgithub;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPrefernce extends AppCompatActivity {

    EditText username,password;
    CheckBox rememberMe;
    Boolean save;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefernce);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        rememberMe = findViewById(R.id.checkbox);

        sharedPreferences = getSharedPreferences("LoginReference",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        save = sharedPreferences.getBoolean("saveData",true);
        if(save == true)
        {
            username.setText(sharedPreferences.getString("username",null));
            password.setText(sharedPreferences.getString("password",null));

        }



    }

    public void Submit(View view) {
        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();

        if(usernameText.equals("Adil") && passwordText.equals("123456"))
        {
            Toast.makeText(this, "Matched", Toast.LENGTH_SHORT).show();

            if(rememberMe.isChecked())
            {
                editor.putBoolean("saveData",true);
                editor.putString("username",usernameText);
                editor.putString("password",passwordText);
                editor.commit();
            }
        }
        else {
            Toast.makeText(this, "Wrong info!", Toast.LENGTH_SHORT).show();
        }
    }
}
