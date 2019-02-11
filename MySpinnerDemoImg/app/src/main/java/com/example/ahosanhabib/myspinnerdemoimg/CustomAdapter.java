package com.example.ahosanhabib.myspinnerdemoimg;

import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    private String[] countrynames;
    private String[] population;
    int[] flags;
    Context context;
    private LayoutInflater layoutInflater;

    CustomAdapter(Context context,int[] flags,String[] countrynames,String[] population){

        this.context = context;
        this.flags = flags;
        this.countrynames = countrynames;
        this.population = population;

    }

    @Override
    public int getCount() {
        return countrynames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.sample_layout,null,false);

            ImageView imageView = convertView.findViewById(R.id.imageID);
            imageView.setImageResource(flags[position]);

            TextView countries = convertView.findViewById(R.id.countrynameID);
            countries.setText(countrynames[position]);

            TextView populationNumber = convertView.findViewById(R.id.populationID);
            populationNumber.setText(population[position]);
        }


        return convertView;
    }
}
