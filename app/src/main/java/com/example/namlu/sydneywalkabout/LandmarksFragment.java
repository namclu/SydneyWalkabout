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
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.landmark_title_opera_house),
                getString(R.string.landmark_description_opera_house)));

        // Create a {@link TourItemAdapter}, whose data source is a list of {@link TourItem}s. The
        // adapter knows how to create list items for each item in the list.
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getContext(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(tourItemAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
