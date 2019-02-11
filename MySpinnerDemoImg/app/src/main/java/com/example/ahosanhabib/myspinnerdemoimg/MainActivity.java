package com.example.ahosanhabib.myspinnerdemoimg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] countrynames;
    private String[] population;
    private int[] flags = {R.drawable.afganisthan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,
            R.drawable.japan,R.drawable.nepal};
    private boolean isitemselected = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerID);
        countrynames = getResources().getStringArray(R.array.country_names);
        population = getResources().getStringArray(R.array.population);

        CustomAdapter customadapter = new CustomAdapter(this,flags,countrynames,population);
        spinner.setAdapter(customadapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(isitemselected==true){
                    isitemselected = false;
                }else {
                    Toast.makeText(MainActivity.this,countrynames[position]+" is selected",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
