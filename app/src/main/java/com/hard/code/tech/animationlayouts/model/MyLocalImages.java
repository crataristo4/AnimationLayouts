package com.hard.code.tech.animationlayouts.model;

import android.content.Context;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.hard.code.tech.animationlayouts.BR;


public class MyLocalImages  extends BaseObservable {
    private int images;

    public MyLocalImages(int images) {
        this.images = images;
    }

    @Bindable
    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
        notifyPropertyChanged(BR.images);
    }

    @BindingAdapter("images")
    public static void loadImages(ImageView view, int image) {

        Context context = view.getContext();

        view.setImageDrawable(ContextCompat.getDrawable(context, image));

    }


}
