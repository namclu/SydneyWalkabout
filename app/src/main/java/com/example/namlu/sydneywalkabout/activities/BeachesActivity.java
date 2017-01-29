package com.example.namlu.sydneywalkabout.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.namlu.sydneywalkabout.adapters.BeachesFragment;
import com.example.namlu.sydneywalkabout.R;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_item);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.tour_item_container, new BeachesFragment())
                .commit();
    }
}
