package com.example.android.mymiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens the Numbers Activity
     * @param view
     */
    public void openNumbersList(View view){
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
    

}



