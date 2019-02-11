package com.example.ahosanhabib.mysearchdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    ArrayAdapter<String> adapter;
    private SearchView searchView;
    String[] countrymanes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listID);
        searchView = findViewById(R.id.searchID);

        countrymanes = getResources().getStringArray(R.array.country_names);

        adapter = new ArrayAdapter<>(MainActivity.this,R.layout.sample_layout,R.id.textID,countrymanes);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogbuilder;
        alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);

        alertdialogbuilder.setIcon(R.drawable.question);
        alertdialogbuilder.setTitle(R.string.title_text);
        alertdialogbuilder.setMessage(R.string.messege_text);
        alertdialogbuilder.setCancelable(true);
        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();

    }
}
