package com.example.namlu.sydneywalkabout;

/**
 * Created by namlu on 21-Jan-17.
 * <p>
 * TourItem represents a single tour item that the user wants to visit.
 */

public class TourItem {

    // Used to indicate if an imageResId was assigned with a valid image ID or not
    private static final int NO_IMAGE = -1;

    // Image resource ID for the Tour image
    private int mTourImageResId = NO_IMAGE;

    // String resource ID for the Tour title
    private String mTourTitle;

    // String resource ID for the Tour description
    private String mTourDescription;

    /*
     * Create a new TourItem object.
     *
     * @param mTourTitle the title of the tour item
     * @param mToutItemDescription - the description of the tour item
     */
    public TourItem(String tourTitle, String tourDescription){
        setTourTitle(tourTitle);
        setTourDescription(tourDescription);
    }

    /*
     * Create a new TourItem object w/ image.
     *
     * @param mTourImageRedId the image resID of the tour item
     * @param mTourTitle the title of the tour item
     * @param mToutItemDescription - the description of the tour item
     */
    public TourItem(int tourImageResId, String tourTitle, String tourDescription){
        setTourImageResId(tourImageResId);
        setTourTitle(tourTitle);
        setTourDescription(tourDescription);
    }

    /*
     * Getter and setter methods for TourItem
     */

    public int getTourImageResId() {
        return mTourImageResId;
    }

    public void setTourImageResId(int tourImageResId) {
        mTourImageResId = tourImageResId;
    }

    public boolean hasImage(){
        return mTourImageResId != NO_IMAGE;
    }

    public String getTourTitle() {
        return mTourTitle;
    }

    public void setTourTitle(String tourTitle) {
        mTourTitle = tourTitle;
    }

    public String getTourDescription() {
        return mTourDescription;
    }

    public void setTourDescription(String tourDescription) {
        mTourDescription = tourDescription;
    }
}
