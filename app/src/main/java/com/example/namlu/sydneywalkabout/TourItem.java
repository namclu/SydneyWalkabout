package com.example.namlu.sydneywalkabout;

/**
 * Created by namlu on 21-Jan-17.
 * <p>
 * TourItem represents a single tour item that the user wants to visit.
 */

public class TourItem {

    // String resource ID for the TourItem title
    private String mTourItemTitle;

    // String resource ID for the TourItem description
    private String mTourItemDescription;

    /*
     * Create a new TourItem object.
     *
     * @param mTourItemTitle the title of the tour item
     * @param mToutItemDescription - the description of the tour item
     */
    public TourItem(String tourItemTitle, String tourItemDescription){
        mTourItemTitle = tourItemTitle;
        mTourItemDescription = tourItemDescription;
    }

    /*
     * Getter and setter methods for TourItem
     */

    public String getTourItemTitle() {
        return mTourItemTitle;
    }

    public void setTourItemTitle(String tourItemTitle) {
        mTourItemTitle = tourItemTitle;
    }

    public String getTourItemDescription() {
        return mTourItemDescription;
    }

    public void setTourItemDescription(String tourItemDescription) {
        mTourItemDescription = tourItemDescription;
    }
}
