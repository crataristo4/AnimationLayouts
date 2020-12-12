package com.hard.code.tech.animationlayouts.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.hard.code.tech.animationlayouts.R;
import com.hard.code.tech.animationlayouts.databinding.LayoutItemUsersBinding;
import com.hard.code.tech.animationlayouts.model.ItemUserModel;

import java.util.List;

public class ItemUsersRecyclerAdapter extends RecyclerView.Adapter<ItemUsersRecyclerAdapter.MyItemsViewHolder> {


    private List<ItemUserModel> itemUserModelList;
    private Context context;

    public ItemUsersRecyclerAdapter(List<ItemUserModel> itemUserModelList, Context context) {
        this.itemUserModelList = itemUserModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutItemUsersBinding layoutItemUsersBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.layout_item_users, parent, false);

        return new MyItemsViewHolder(layoutItemUsersBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyItemsViewHolder holder, int position) {

        ItemUserModel itemUserModel = itemUserModelList.get(position);
        holder.layoutItemUsersBinding.setUsers(itemUserModel);

    }

    @Override
    public int getItemCount() {
        return itemUserModelList == null ? 0 : itemUserModelList.size();
    }


    static class MyItemsViewHolder extends RecyclerView.ViewHolder {

        LayoutItemUsersBinding layoutItemUsersBinding;

        MyItemsViewHolder(@NonNull LayoutItemUsersBinding layoutItemUsersBinding) {
            super(layoutItemUsersBinding.getRoot());

            this.layoutItemUsersBinding = layoutItemUsersBinding;
        }
    }


}
