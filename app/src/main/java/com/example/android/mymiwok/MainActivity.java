package com.example.android.mymiwok;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
//
//
//// Find the View that shows the correct category
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//        TextView family = (TextView) findViewById(R.id.family);
//        TextView colors = (TextView) findViewById(R.id.colors);
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//// Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view) {
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(numbersIntent);
//            }
//        });
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent phrasesIntent = new Intent(MainActivity.this, PhraseActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });
    }

}



