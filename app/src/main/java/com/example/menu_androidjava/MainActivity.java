package com.example.menu_androidjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.cappu:
                startActivity(new Intent(this, Cappucino.class));
                return true;

            case R.id.ristre:
                startActivity(new Intent(this, Ristreto.class));
                return true;

            case R.id.flat:
                startActivity(new Intent(this, FlattCoffe.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
