package com.hard.code.tech.animationlayouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.hard.code.tech.animationlayouts.databinding.ActivityStartScreenBinding;

public class StartScreen extends AppCompatActivity {

    ActivityStartScreenBinding activityStartScreenBinding;
    AnimateLayoutListener animateLayoutListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityStartScreenBinding = DataBindingUtil.setContentView(this,R.layout.activity_start_screen);
        animateLayoutListener = new AnimateLayoutListener(this);
        activityStartScreenBinding.setClickEvent(animateLayoutListener);
        activityStartScreenBinding.startLayout.animate().alpha(1.0f).setDuration(5000);

    }
}
