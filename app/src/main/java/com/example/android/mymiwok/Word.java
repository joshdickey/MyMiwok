package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;

public class Word extends AppCompatActivity {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceID;
    private int mAudioResID;


    public Word(String defaultTranslation, String miwokTranslation, int resAudioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResID = resAudioID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceID, int resAudioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceID = resourceID;
        mAudioResID = resAudioID;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getResourceID(){ return mResourceID;}

    public int getmAudioResID(){ return mAudioResID;}
}
