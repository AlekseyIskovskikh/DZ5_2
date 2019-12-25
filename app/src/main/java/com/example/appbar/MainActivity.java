package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar Toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(Toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, getText(R.string.appZapiska), Toast.LENGTH_LONG).show();
            Intent intentNotes1 = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes1);
            return true;
        }
        if (id == R.id.action_open_screenrun) {
            Toast.makeText(MainActivity.this, getText(R.string.appScreenrun), Toast.LENGTH_LONG).show();
            Intent intentNotes2 = new Intent(MainActivity.this, ScreenranActivity.class);
            startActivity(intentNotes2);
            return true;
        }
        if (id == R.id.action_open_spinner) {
            Toast.makeText(MainActivity.this, getText(R.string.appSpinner), Toast.LENGTH_LONG).show();
            Intent intentNotes3 = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentNotes3);
            return true;
        }
        if (id == R.id.action_open_calendar) {
            Toast.makeText(MainActivity.this, getText(R.string.appCalendar), Toast.LENGTH_LONG).show();
            Intent intentNotes4 = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentNotes4);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

}
