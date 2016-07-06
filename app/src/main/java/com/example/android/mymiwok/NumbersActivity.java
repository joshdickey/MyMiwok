package com.example.android.mymiwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.GridView.*;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();

        //words.add("One");

        words.add(new Word("One", "Lutti"));

        words.add(new Word("Two", "otiiko"));
        words.add(new Word("Three", "tolookosu"));
        words.add(new Word("Four", "oyyisa"));
        words.add(new Word("Five", "massokka"));
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
