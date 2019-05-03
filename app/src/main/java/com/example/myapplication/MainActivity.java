package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Log.e("DATE", new Date().toString());
        Log.w("DATE", new Date().toString());
        Log.wtf("DATE", new Date().toString());*/


    }

    public void choiceDone(View v){
        if(v.getId() == R.id.upload_menu){

        } else if(v.getId() == R.id.upload_plats){

            Intent i = new Intent(this, PlatsActivity.class);
            startActivity(i);

        } else if (v.getId() == R.id.upload_rate){
            Intent i = new Intent(this, RateActivity.class);
            startActivity(i);

        }else if (v.getId() == R.id.upload_map) {

        }
    }
}
