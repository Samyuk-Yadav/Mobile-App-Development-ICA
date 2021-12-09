package com.example.newfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import HelperClasses.Slider_Adapter;

public class Introduction extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dots;

    Slider_Adapter slider_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Introduction", "onCreate");
        setContentView(R.layout.activity_introduction);

        viewPager = findViewById(R.id.slider);
        dots = findViewById(R.id.scroll);

        //Adapter Calling
        slider_adapter = new Slider_Adapter(this);
        viewPager.setAdapter(slider_adapter);
    }
}