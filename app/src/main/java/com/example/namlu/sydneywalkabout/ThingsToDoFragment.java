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
public class ThingsToDoFragment extends Fragment {


    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(R.drawable.botanic_gardens, getString(R.string.title_botanic_gardens),
                getString(R.string.description_botanic_gardens)));
        tourItems.add(new TourItem(R.drawable.hyde_park, getString(R.string.title_hyde_park),
                getString(R.string.description_hyde_park)));
        tourItems.add(new TourItem(R.drawable.luna_park, getString(R.string.title_luna_park),
                getString(R.string.description_luna_park)));
        tourItems.add(new TourItem(R.drawable.ocean_pool, getString(R.string.title_ocean_pool),
                getString(R.string.description_ocean_pool)));
        tourItems.add(new TourItem(R.drawable.taronga_zoo, getString(R.string.title_taronga_zoo),
                getString(R.string.description_taronga_zoo)));

        /*
        * See LandmarksFragment.java for detailed comments about code below
        * */
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(tourItemsAdapter);

        return rootView;
    }
}
