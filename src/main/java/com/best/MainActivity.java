package com.best;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.best.createProfile.CreateProfileActivity;
import com.best.loadProfile.LoadProfileActivity;
import com.best.settings.SettingsActivity;
import com.best.subtasks.RBE.RBETest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void infoClick(MenuItem item) {
        Intent intent = new Intent(this, AdditionalInfo.class);
        startActivity(intent);
    }

    public void settingsClick(MenuItem item) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void createProfileClick(View view) {
        Intent intent = new Intent(this, CreateProfileActivity.class);
        startActivity(intent);
    }

    public void loadProfileClick(View view) {
        Intent intent = new Intent(this, LoadProfileActivity.class);
        startActivity(intent);
    }

    public void instructionsClick(View view) {
        // TODO
        Intent intent = new Intent(this, RBETest.class);
        startActivity(intent);
    }




    /*
    public void testClick(View view) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String x = sharedPref.getString("rvePref", "");

        Button b = findViewById(R.id.loadprofileButton);
        b.setText(x);
    }
    */


}