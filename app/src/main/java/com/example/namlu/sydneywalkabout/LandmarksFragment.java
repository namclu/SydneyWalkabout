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
public class LandmarksFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static LandmarksFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        LandmarksFragment fragment = new LandmarksFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    public LandmarksFragment() {
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

        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));
        tourItems.add(new TourItem(getString(R.string.title_opera_house),
                getString(R.string.description_opera_house)));

        // Create a {@link TourItemsAdapter}, whose data source is a list of {@link TourItem}s. The
        // adapter knows how to create list items for each item in the list.
        TourItemsAdapter tourItemsAdapter = new TourItemsAdapter(getContext(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(tourItemsAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
