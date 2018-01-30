package com.example.codetribe.itutourguide;

/**
 * Created by codeTribe on 6/28/2017.
 */

public class Word {
    private  String mDefaultTransalation;

    private  String mMiwokTranslation;

    private int mImageResourceId=NO_IMAGE_PROVIDED ;
    private static  final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTransalation,String miiwokTranslation) {
        mDefaultTransalation =defaultTransalation;
        mMiwokTranslation =miiwokTranslation;
    }

    public Word(String defaultTransalation,String miiwokTranslation,int imageResourceId) {
        mDefaultTransalation =defaultTransalation;
        mMiwokTranslation =miiwokTranslation;
        mImageResourceId=imageResourceId;
    }


    public String getDefaultTransalation() {
        return mDefaultTransalation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return  mImageResourceId !=NO_IMAGE_PROVIDED;
    }
}
