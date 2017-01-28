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
public class WhereToEatFragment extends Fragment {


    public WhereToEatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

        tourItems.add(new TourItem(getString(R.string.title_auburn),
                getString(R.string.description_auburn)));
        tourItems.add(new TourItem(getString(R.string.title_cabramatta),
                getString(R.string.description_cabramatta)));
        tourItems.add(new TourItem(getString(R.string.title_chinatown),
                getString(R.string.description_chinatown)));
        tourItems.add(new TourItem(getString(R.string.title_newtown),
                getString(R.string.description_newtown)));
        tourItems.add(new TourItem(getString(R.string.title_surry_hills),
                getString(R.string.description_surry_hills)));

        /*
        * See LandmarksFragment.java for detailed comments about code below
        * */
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(tourItemsAdapter);

        return rootView;
    }

}
