package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        //words.add("One");

        words.add(new Word("Where are you going?", "minto wuksus"));

        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "Tolookosu"));
        words.add(new Word("How are you feeling?", "Oyyisa"));
        words.add(new Word("I’m feeling good.", "Massokka"));
        words.add(new Word("Are you coming?", "temmokka"));
        words.add(new Word("Yes, I’m coming.", "kenekaku"));
        words.add(new Word("I’m coming.", "kawinta"));
        words.add(new Word("Let’s go.", "wo'e"));
        words.add(new Word("Come here.", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
