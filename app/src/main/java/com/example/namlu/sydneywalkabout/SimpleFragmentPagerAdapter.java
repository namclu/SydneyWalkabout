package com.example.namlu.sydneywalkabout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by namlu on 21-Jan-17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    // Variables used in TabLayout
    private final static int PAGE_COUNT = 2;
    private String mTabTitles[] = new String[] { "Tab1", "Tab2"};
    private Context mContext;

    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else {
            return new BeachesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return mTabTitles[position];
        if (position == 0) {
            return mContext.getString(R.string.title_opera_house);
        } else {
            return mContext.getString(R.string.title_bondi);
        }
    }
}
