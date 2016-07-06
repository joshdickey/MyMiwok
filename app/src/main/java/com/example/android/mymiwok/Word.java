package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;

public class Word extends AppCompatActivity {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private String mIcon;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, String icon){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mIcon = icon;
    }
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmIcon(){ return mIcon;}
}
