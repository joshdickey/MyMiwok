package com.example.android.mymiwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jdickey on 7/6/2016.
 */
public class WordAdapter extends ArrayAdapter<Word>{


    private int mColor;
    /*
    * custom constructor taking in the this context and a Word class
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int color){
        super(context, 0, words);
        mColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }


        final Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defauld_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon);
        if(currentWord.getResourceID() != 0) {
            iconView.setImageResource(currentWord.getResourceID());

            iconView.setVisibility(View.VISIBLE);
        }else {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color  = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        View iconContainer = listItemView.findViewById(R.id.icon_container);
        iconContainer.setBackgroundColor(color);

        return listItemView;
    }
}
