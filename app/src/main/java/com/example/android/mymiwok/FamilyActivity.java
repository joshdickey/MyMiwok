package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();

        //words.add("One");

        words.add(new Word("father", "әpә"));

        words.add(new Word("mother", "әṭa"));
        words.add(new Word("son", "angsi"));
        words.add(new Word("daughter", "tune"));
        words.add(new Word("older brotherve", "taachi"));
        words.add(new Word("younger brother", "chalitti"));
        words.add(new Word("older sister", "kenekaku"));
        words.add(new Word("younger sister", "kawinta"));
        words.add(new Word("grandmother", "wo'e"));
        words.add(new Word("grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
