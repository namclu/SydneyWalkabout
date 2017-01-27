package com.example.namlu.sydneywalkabout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

        tourItems.add(new TourItem(R.drawable.bondi_coogee, getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));

        /*
        * See LandmarksFragment.java for detailed comments about code below
        * */
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(tourItemsAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
