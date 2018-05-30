package com.teamflybd.nougatbatchgithub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IntentEmail extends AppCompatActivity {
    EditText toEmail,subject,textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_email);

        Initilize();

    }

    private void Initilize() {
        toEmail = findViewById(R.id.emailInput);
        subject = findViewById(R.id.subjectInput);
        textMessage = findViewById(R.id.textInput);
    }
    public void submit(View view)
    {
        sendMail();
    }

    private void sendMail() {
        String receiptsEmail = toEmail.getText().toString();
        String[] receiptlist = receiptsEmail.split(",");

        String subjectString = subject.getText().toString();
        String textMessageString = textMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,receiptlist);
        intent.putExtra(Intent.EXTRA_SUBJECT,subjectString);
        intent.putExtra(Intent.EXTRA_TEXT,textMessageString);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Select a email client"));

    }
}
