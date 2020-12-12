package com.hard.code.tech.animationlayouts;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.hard.code.tech.animationlayouts.databinding.ActivityPageTwoBinding;

public class PageTwoActivity extends AppCompatActivity {

    ActivityPageTwoBinding activityPageTwoBinding;
    AnimateLayoutListener animateLayoutListener;
    TextView txtPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityPageTwoBinding = DataBindingUtil.setContentView(this, R.layout.activity_page_two);
        txtPress = activityPageTwoBinding.txtPress;
        txtPress.startAnimation(AnimationUtils.loadAnimation(this, R.anim.blinking_animation));


   /*     Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        txtPress.setBackgroundColor(color);
        /*Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(40);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);*/

        animateLayoutListener = new AnimateLayoutListener(activityPageTwoBinding.rippleContent);
        activityPageTwoBinding.setOnRipple(animateLayoutListener);

    }
}
