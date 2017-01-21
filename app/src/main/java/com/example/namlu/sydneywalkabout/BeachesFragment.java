package com.example.namlu.sydneywalkabout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static BeachesFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        BeachesFragment fragment = new BeachesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_item_list_view, container, false);

        // For adding a TabLayout
        TextView textView = (TextView) rootView;
        textView.setText("Fragment # " + mPage);

        // Create a list of tour items
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

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
        tourItems.add(new TourItem(getString(R.string.title_bondi),
                getString(R.string.description_bondi)));

        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(tourItemsAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
