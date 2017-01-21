package com.example.namlu.sydneywalkabout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by namlu on 21-Jan-17.
 *
 * {@link TourItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link TourItem} objects.
 */

public class TourItemAdapter extends ArrayAdapter<TourItem> {

    public TourItemAdapter(Context context, ArrayList<TourItem> tourItems) {
        super(context, 0, tourItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if existing view is being reused, otherwise inflate the view
        View tourItemView = convertView;

        if (tourItemView == null) {
            tourItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_item, parent, false);
        }

        // Get the {@link TourItem} object located at this position in the list
        TourItem currentTourItem = this.getItem(position);

        // Find the TourItem title in the tour_item.xml layout, then get the title from currentTourItem
        //      and set this title as the text
        TextView tourItemTitle = (TextView) tourItemView.findViewById(R.id.tour_item_title);
        tourItemTitle.setText(currentTourItem.getTourItemTitle());

        // Find the TourItem description in the tour_item.xml layout, then get the description from currentTourItem
        //      and set this description as the text
        TextView tourItemDescription = (TextView) tourItemView.findViewById(R.id.tour_item_description);
        tourItemDescription.setText(currentTourItem.getTourItemDescription());

        // Return the whole list item layout so that it can be shown in the ListView.
        return tourItemView;
    }
}
