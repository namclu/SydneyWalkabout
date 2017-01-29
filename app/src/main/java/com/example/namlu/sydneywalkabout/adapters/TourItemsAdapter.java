package com.example.namlu.sydneywalkabout.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.namlu.sydneywalkabout.R;
import com.example.namlu.sydneywalkabout.model.TourItem;

import java.util.ArrayList;

/**
 * Created by namlu on 21-Jan-17.
 *
 * {@link TourItemsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link TourItem} objects.
 */

public class TourItemsAdapter extends ArrayAdapter<TourItem> {

    public TourItemsAdapter(Context context, ArrayList<TourItem> tourItems) {
        super(context, 0, tourItems);
    }

    // ViewHolder to cache our views
    static class ViewHolder{
        ImageView image;
        TextView title;
        TextView description;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tour_item, parent, false);
        }

        // Get the {@link TourItem} object located at this position in the list
        TourItem currentTourItem = getItem(position);

        // Find the TourItem image in the tour_item.xml layout, then get the image from currentTourItem
        //      and set the image
        viewHolder.image = (ImageView) convertView.findViewById(R.id.iv_tour_image);
        if (currentTourItem.hasImage()) {
            viewHolder.image.setImageResource(currentTourItem.getTourImageResId());
            viewHolder.image.setVisibility(View.VISIBLE);
        } else {
            viewHolder.image.setVisibility(View.GONE);
        }

        // Find the TourItem title in the tour_item.xml layout, then get the title from currentTourItem
        //      and set this title as the text
        viewHolder.title = (TextView) convertView.findViewById(R.id.tv_tour_title);
        viewHolder.title.setText(currentTourItem.getTourTitle());

        // Find the TourItem description in the tour_item.xml layout, then get the description from currentTourItem
        //      and set this description as the text
        viewHolder.description = (TextView) convertView.findViewById(R.id.tv_tour_description);
        viewHolder.description.setText(currentTourItem.getTourDescription());

        // Return the whole list item layout so that it can be shown in the ListView.
        return convertView;
    }
}
