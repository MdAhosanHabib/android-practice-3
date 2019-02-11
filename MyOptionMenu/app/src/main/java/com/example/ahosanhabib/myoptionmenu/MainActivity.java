package com.example.ahosanhabib.myoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.settingID){

            Toast.makeText(MainActivity.this,"select setting option",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.shareID){

            Toast.makeText(MainActivity.this,"select share option",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.feedbackID){

            Toast.makeText(MainActivity.this,"select feedback option",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.aboutusID){

            Toast.makeText(MainActivity.this,"select about us option",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}
