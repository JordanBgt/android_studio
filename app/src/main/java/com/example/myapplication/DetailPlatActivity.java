package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.plats.Plat;

public class DetailPlatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plat);

        Plat p = (Plat)getIntent().getSerializableExtra("plat");

        TextView description = findViewById(R.id.detail_description);
        ImageView image = findViewById(R.id.detail_img);
        TextView label = findViewById(R.id.detail_label);

        description.setText(p.getDescription());
        label.setText(p.getLabel());
        int id = this.getResources().getIdentifier(p.getImageUrl(), "drawable", this.getPackageName());
        image.setImageResource(id);
    }
}
