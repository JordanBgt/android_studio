package com.example.myapplication;

import android.content.Intent;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void seConnecter(View v) {

        EditText login = (EditText)findViewById(R.id.login);
        EditText password = (EditText)findViewById(R.id.password);

        if ((login.getText().toString().equals("jojinou")) && (password.getText().toString().equals("prout"))) {
            Toast.makeText(this, "HELLO", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, getString(R.string.connectionError), Toast.LENGTH_LONG).show();
        }
    }
}
