package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.plats.Plat;

public class PlatsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        PlatAdapter a = new PlatAdapter(this, 0);
        Plat p1 = new Plat("plat1", "Crevette Ananas", 15.5, "Description 1");
        Plat p2 = new Plat("plat2", "Sauté de porce", 14.0, "Description 2");
        Plat p3 = new Plat("plat3", "Crevette ", 13.0, "Description 3");
        Plat p4 = new Plat("plat4", "Boeuf en sauce", 12.0, "Description 4");
        Plat p5 = new Plat("plat5", "Crevette Ananas", 16.0, "Description 5");
        Plat p6 = new Plat("plat6", "Crevette Ananas", 12.0, "Description 6");
        Plat p7 = new Plat("plat7", "Crevette Ananas", 10.0, "Description 7");
        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);
        a.add(p6);
        a.add(p7);
        liste.setAdapter(a);
        liste.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListView liste = (ListView)parent;
        Plat selected = (Plat)liste.getAdapter().getItem(position);
        Intent i = new Intent(this, DetailPlatActivity.class);
        i.putExtra("plat", selected);
        startActivity(i);
    }
}
