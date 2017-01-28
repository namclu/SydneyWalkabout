package com.example.namlu.sydneywalkabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WhereToEatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_item);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.tour_item_container, new WhereToEatFragment())
                .commit();
    }
}
