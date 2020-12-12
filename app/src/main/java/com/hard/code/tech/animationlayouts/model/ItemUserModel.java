package com.hard.code.tech.animationlayouts.model;

import android.content.Context;

import androidx.core.content.ContextCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;


import com.hard.code.tech.animationlayouts.BR;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemUserModel extends BaseObservable {
    private int images;
    private String names;


    public ItemUserModel(int images, String names) {
        this.images = images;
        this.names = names;
    }

@Bindable
    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
        notifyPropertyChanged(BR.images);
    }
    @Bindable
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
        notifyPropertyChanged(BR.names);
    }


    @BindingAdapter("userImages")
    public static void loadImages(CircleImageView view, int image) {

        Context context = view.getContext();

        view.setImageDrawable(ContextCompat.getDrawable(context, image));

    }

}
