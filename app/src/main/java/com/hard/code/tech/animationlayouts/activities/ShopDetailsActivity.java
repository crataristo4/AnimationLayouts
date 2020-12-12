package com.hard.code.tech.animationlayouts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.hard.code.tech.animationlayouts.R;
import com.hard.code.tech.animationlayouts.adapter.ItemUsersRecyclerAdapter;
import com.hard.code.tech.animationlayouts.databinding.ActivityShopDetailsBinding;
import com.hard.code.tech.animationlayouts.model.ItemUserModel;

import java.util.ArrayList;
import java.util.List;

public class ShopDetailsActivity extends AppCompatActivity {


    ItemUsersRecyclerAdapter itemUsersRecyclerAdapter;
    RecyclerView recyclerView;
    ActivityShopDetailsBinding activityShopDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityShopDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_shop_details);
        activityShopDetailsBinding.imgBack.setOnClickListener(view -> onBackPressed());

        itemUsersRecyclerAdapter = new ItemUsersRecyclerAdapter(prepareUsers(),this);

        recyclerView = activityShopDetailsBinding.itemLayout.recyclerItemUser;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(itemUsersRecyclerAdapter);



    }


    private List<ItemUserModel> prepareUsers() {

        List<ItemUserModel> itemUserModels = new ArrayList<>();

        itemUserModels.add(new ItemUserModel(R.drawable.werewrer, "Sedrick"));
        itemUserModels.add(new ItemUserModel(R.drawable.abn, "Sedrick"));
        itemUserModels.add(new ItemUserModel(R.drawable.imagesop, "Ebo"));
        itemUserModels.add(new ItemUserModel(R.drawable.imagesgh, "Nana Yaw"));
        itemUserModels.add(new ItemUserModel(R.drawable.imagesfg, "Hamed"));
        itemUserModels.add(new ItemUserModel(R.drawable.images, "kOFi"));
        itemUserModels.add(new ItemUserModel(R.drawable.etrttrtr, "kOJO"));
        itemUserModels.add(new ItemUserModel(R.drawable.dsfds, "Abeiku"));
        itemUserModels.add(new ItemUserModel(R.drawable.dsfadfdsfds, "Kweku"));
        itemUserModels.add(new ItemUserModel(R.drawable.dsfadfadfd, "Samuel"));
        itemUserModels.add(new ItemUserModel(R.drawable.adfdsfdsff, "Hafiz"));


        return itemUserModels;
    }
}
