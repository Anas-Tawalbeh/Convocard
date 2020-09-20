package com.example.convocard;


import android.provider.ContactsContract;

public class Backgrounds {
    //Image discription
    private String mDiscription;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;
    // Icon resource Id
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // class Constuctor
    public Backgrounds(int ImageResourceId,String discription){
        mDiscription=discription;
        mImageResourceId= ImageResourceId;
    }

    /*
     *get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDiscription;
    }
    /*
     *get the resource id of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
