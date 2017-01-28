package com.example.namlu.sydneywalkabout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Declare instance variables and BindView using Butterknife
    @BindView(R.id.tabs_main) TabLayout mTabLayout;
    @BindView(R.id.viewpager_main) ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Call TabLayout.setupWithViewPager() to link TabLayout with ViewPager
        mTabLayout.setupWithViewPager(mViewPager);

        // Call setupViewPager() method
        setupViewPager(mViewPager);
    }

    /*
    *  Create a ViewPagerAdapter object, add Fragments, and then setAdapter() set an adapter
    *  to supply views for this pager as needed.
    * */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new LandmarksFragment(), "Landmarks");
        adapter.addFragment(new BeachesFragment(), "Beaches");
        adapter.addFragment(new ThingsToDoFragment(), "Things To Do");
        viewPager.setAdapter(adapter);
    }
}
