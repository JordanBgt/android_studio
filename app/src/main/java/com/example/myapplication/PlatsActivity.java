package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.plats.Plat;

public class PlatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        PlatAdapter a = new PlatAdapter(this, 0);
        Plat p1 = new Plat("plat1", "Crevette Ananas", 15.5);
        Plat p2 = new Plat("plat2", "Sauté de porce", 14.0);
        Plat p3 = new Plat("plat3", "Crevette ", 13.0);
        Plat p4 = new Plat("plat4", "Boeuf en sauce", 12.0);
        Plat p5 = new Plat("plat5", "Crevette Ananas", 16.0);
        Plat p6 = new Plat("plat6", "Crevette Ananas", 12.0);
        Plat p7 = new Plat("plat7", "Crevette Ananas", 10.0);
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);
        a.add(p6);
        a.add(p7);
        liste.setAdapter(a);

    }
}
