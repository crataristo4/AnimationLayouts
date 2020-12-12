package com.hard.code.tech.animationlayouts.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.hard.code.tech.animationlayouts.R;

public class HomePageAdapter extends PagerAdapter {

    //object of the Context class to allow views to be passed into another activity
    private final Context context;
    //Array of type int to display the descriptions that moves on the screen
    private final int[] slideImages = {R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.j, R.drawable.h, R.drawable.i
            , R.drawable.j, R.drawable.k, R.drawable.l};


    public HomePageAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return slideImages.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        assert layoutInflater != null;
        View view = layoutInflater.inflate(R.layout.layout_slide_items, container, false);

        ImageView imageView = view.findViewById(R.id.slideImage);

        imageView.setImageResource(slideImages[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);

    }
}
