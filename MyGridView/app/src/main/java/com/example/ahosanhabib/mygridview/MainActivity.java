package com.example.ahosanhabib.mygridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] countrynames;
    private int[] flags = {R.drawable.afganisthan,R.drawable.armenia,R.drawable.azerbaijan,R.drawable.bahrain,
            R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.nepal,
            R.drawable.pakistan,R.drawable.sri_lanka};
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrynames = getResources().getStringArray(R.array.country_names);
        gridView = findViewById(R.id.gridviewID);

        CustomAdapter adapter = new CustomAdapter(this,countrynames,flags);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countrynames[position];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
