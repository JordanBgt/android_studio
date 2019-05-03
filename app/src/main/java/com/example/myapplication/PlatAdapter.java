package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.plats.Plat;

/**
 * Pour chaque donnée qu'on va lui passer, va créer un bouton dans le layout
 */
public class PlatAdapter extends ArrayAdapter<Plat> {


    public PlatAdapter(Context context, int resource) {
        super(context, resource);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View v = inflater.inflate(R.layout.plat_item, null);
        Plat data = this.getItem(position);
        TextView tv1 = v.findViewById(R.id.item_text);
        tv1.setText(data.getLabel());
        TextView tv2 = v.findViewById(R.id.item_prix);
        tv2.setText(data.getPrix()+" €");
        ImageView img = v.findViewById(R.id.item_image);
        // à partir du nom on récupère le drawable qui correspond
        Context context = this.getContext();
        int id = context.getResources().getIdentifier(data.getImageUrl(), "drawable", context.getPackageName());
        img.setImageResource(id);
        return v;
    }
}
