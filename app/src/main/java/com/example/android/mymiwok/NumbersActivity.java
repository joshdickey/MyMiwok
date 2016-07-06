package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        //words.add("One");

        words.add(new Word("One", "Lutti"));

        words.add(new Word("Two", "Otiiko"));
        words.add(new Word("Three", "Tolookosu"));
        words.add(new Word("Four", "Oyyisa"));
        words.add(new Word("Five", "Massokka"));
        words.add(new Word("Six", "temmokka"));
        words.add(new Word("Seven", "kenekaku"));
        words.add(new Word("Eight", "kawinta"));
        words.add(new Word("Nine", "wo'e"));
        words.add(new Word("Ten", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
