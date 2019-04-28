package com.croozer.animalkingdom;

public class Names {

    private String mCommonNames;
    private String mScientificNames;
    private int mImageResourceId;
    private int mImageLocationId;

    public Names(String CommonNames, String ScientificNames, int ImageResourceId, int ImageLocationId) {
        this.mCommonNames = CommonNames;
        this.mScientificNames = ScientificNames;
        this.mImageResourceId = ImageResourceId;
        this.mImageLocationId = ImageLocationId;
    }

    public String getmCommonNames() {
        return mCommonNames;
    }

    public String getmScientificNames() {
        return mScientificNames;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmImageLocationId() {
        return mImageLocationId;
    }
}
