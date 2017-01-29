package com.example.namlu.sydneywalkabout.adapters;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.namlu.sydneywalkabout.R;
import com.example.namlu.sydneywalkabout.model.TourItem;

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

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(R.drawable.anzac_memorial, getString(R.string.title_anzac_memorial),
                getString(R.string.description_anzac_memorial)));
        tourItems.add(new TourItem(R.drawable.harbour_bridge, getString(R.string.title_harbour_bridge),
                getString(R.string.description_harbour_bridge)));
        tourItems.add(new TourItem(R.drawable.opera_house, getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(R.drawable.queen_victoria_building, getString(R.string.title_queen_victoria_building),
                getString(R.string.description_queen_victoria_building)));
        tourItems.add(new TourItem(R.drawable.st_marys_cathedral, getString(R.string.title_st_marys),
                getString(R.string.description_st_marys)));

        // Create a {@link TourItemsAdapter}, whose data source is a list of {@link TourItem}s. The
        // adapter knows how to create list items for each item in the list.
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(tourItemsAdapter);

        return rootView;
    }
}
