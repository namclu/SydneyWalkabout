package com.example.namlu.sydneywalkabout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Declare instance variables
    @BindView(R.id.tabs_main) TabLayout mTabLayout;
    @BindView(R.id.viewpager_main) ViewPager mViewPager;
    //private TabLayout mTabLayout;
    //private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Find the view pager that will allow the user to swipe between fragments
        //mViewPager = (ViewPager) findViewById(R.id.viewpager_main);
        setupViewPager(mViewPager);

        //mTabLayout = (TabLayout) findViewById(R.id.tabs_main);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new LandmarksFragment(), "Landmarks");
        adapter.addFragment(new BeachesFragment(), "Beaches");
        viewPager.setAdapter(adapter);

    }
}
