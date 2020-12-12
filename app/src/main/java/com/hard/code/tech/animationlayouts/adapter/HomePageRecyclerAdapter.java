package com.hard.code.tech.animationlayouts.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.hard.code.tech.animationlayouts.R;
import com.hard.code.tech.animationlayouts.activities.ShopDetailsActivity;
import com.hard.code.tech.animationlayouts.databinding.LayoutSlideItemsBinding;
import com.hard.code.tech.animationlayouts.model.MyLocalImages;

import java.util.List;

public class HomePageRecyclerAdapter extends RecyclerView.Adapter<HomePageRecyclerAdapter.MyHomePageViewHolder> {

    private List<MyLocalImages> myLocalImages;
    private Context context;

    public HomePageRecyclerAdapter() {
    }

    public HomePageRecyclerAdapter(List<MyLocalImages> myLocalImages, Context context) {
        this.myLocalImages = myLocalImages;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHomePageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutSlideItemsBinding layoutSlideItemsBinding = DataBindingUtil.
                inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.layout_slide_items, parent, false);

        return new MyHomePageViewHolder(layoutSlideItemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHomePageViewHolder holder, int position) {

        MyLocalImages myLocalImage = myLocalImages.get(position);
        holder.layoutSlideItemsBinding.setLoadImage(myLocalImage);

        holder.layoutSlideItemsBinding.getRoot().setOnClickListener(view -> {

            context.startActivity(new Intent(context, ShopDetailsActivity.class));

        });


    }

    @Override
    public int getItemCount() {
        return myLocalImages == null ? 0 : myLocalImages.size();
    }

    static class MyHomePageViewHolder extends RecyclerView.ViewHolder {

        LayoutSlideItemsBinding layoutSlideItemsBinding;

        MyHomePageViewHolder(@NonNull LayoutSlideItemsBinding layoutSlideItemsBinding) {
            super(layoutSlideItemsBinding.getRoot());

            this.layoutSlideItemsBinding = layoutSlideItemsBinding;
        }
    }


}
