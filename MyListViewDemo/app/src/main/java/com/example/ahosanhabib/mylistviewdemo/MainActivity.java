package com.example.ahosanhabib.mylistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView  = findViewById(R.id.listID);
        final String[] coutrynames = getResources().getStringArray(R.array.country_names);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,R.layout.sample_list,R.id.textID,coutrynames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = coutrynames[position];
                Toast.makeText(MainActivity.this,value+" "+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
