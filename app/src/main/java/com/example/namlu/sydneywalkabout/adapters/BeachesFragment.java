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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<>();

        tourItems.add(new TourItem(R.drawable.bondi, getString(R.string.title_bondi),
                getString(R.string.description_bondi)));
        tourItems.add(new TourItem(R.drawable.clovelly, getString(R.string.title_clovelly),
                getString(R.string.description_clovelly)));
        tourItems.add(new TourItem(R.drawable.coogee, getString(R.string.title_coogee),
                getString(R.string.description_coogee)));
        tourItems.add(new TourItem(R.drawable.manly, getString(R.string.title_manly),
                getString(R.string.description_manly)));
        tourItems.add(new TourItem(R.drawable.palm_beach, getString(R.string.title_palm_beach),
                getString(R.string.description_palm_beach)));

        /*
        * See LandmarksFragment.java for detailed comments about code below
        * */
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(tourItemsAdapter);

        return rootView;
    }
}
