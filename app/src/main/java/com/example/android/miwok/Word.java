package com.example.android.miwok;

/**
 * Created by rashil on 2/8/17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static  final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mAudioResourceId= audioResourceId;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }



    public Word(String defaultTranslation, String miwokTranslation, int imageR,int audioR){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceId= imageR;
        mAudioResourceId= audioR;

    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
    public int getAudioResourceId(){return mAudioResourceId;}
}
