package com.example.niksar.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Pistara.otf");

        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView.setTypeface(tf);
        textView2.setTypeface(tf);
        textView3.setTypeface(tf);
        textView4.setTypeface(tf);

    }

}
