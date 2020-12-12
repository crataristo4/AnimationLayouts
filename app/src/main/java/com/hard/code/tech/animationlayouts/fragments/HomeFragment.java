package com.hard.code.tech.animationlayouts.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hard.code.tech.animationlayouts.R;
import com.hard.code.tech.animationlayouts.adapter.HomePageRecyclerAdapter;
import com.hard.code.tech.animationlayouts.databinding.FragmentHomeBinding;
import com.hard.code.tech.animationlayouts.model.MyLocalImages;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    // private HomePageAdapter pagerAdapter;
    private RecyclerView recyclerView;
    HomePageRecyclerAdapter adapter;
    FragmentHomeBinding fragmentHomeBinding;
    List<MyLocalImages> data;
    //Animation
    private Animation fromTop, fromBottom, fromLeft, fromRight;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

        return fragmentHomeBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //pagerAdapter = new HomePageAdapter(getActivity());
//fragmentHomeBinding.viewPagerHome.setAdapter(pagerAdapter);

//animation
        fromTop = AnimationUtils.loadAnimation(getActivity(), R.anim.from_top);
        fromBottom = AnimationUtils.loadAnimation(getActivity(), R.anim.from_bottom);
        fromLeft = AnimationUtils.loadAnimation(getActivity(), R.anim.slideinleft);
        fromRight = AnimationUtils.loadAnimation(getActivity(), R.anim.slideinright);


        //animate items from bottom to top
        fragmentHomeBinding.textView3.startAnimation(fromBottom);
        fragmentHomeBinding.imageView.startAnimation(fromBottom);
        fragmentHomeBinding.searchView.startAnimation(fromBottom);

        //animate from top to bottom
        fragmentHomeBinding.tabLayout.startAnimation(fromTop);

        //from right to left
        fragmentHomeBinding.textView4.startAnimation(fromLeft);

//        from left to right
        fragmentHomeBinding.reclcer.startAnimation(fromRight);
        fragmentHomeBinding.linearTins.startAnimation(fromRight);

        data = prepareImageList();
        recyclerView = fragmentHomeBinding.reclcer;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        adapter = new HomePageRecyclerAdapter(data, getActivity());
        recyclerView.setAdapter(adapter);


    }


    //Method to Add all items to the data
    private List<MyLocalImages> prepareImageList() {

        //counter for items to loop through
        List<MyLocalImages> localImages = new ArrayList<>();


        localImages.add(new MyLocalImages(R.drawable.a));
        localImages.add(new MyLocalImages(R.drawable.b));
        localImages.add(new MyLocalImages(R.drawable.c));
        localImages.add(new MyLocalImages(R.drawable.d));

        localImages.add(new MyLocalImages(R.drawable.e));
        localImages.add(new MyLocalImages(R.drawable.f));
        localImages.add(new MyLocalImages(R.drawable.g));
        localImages.add(new MyLocalImages(R.drawable.h));

        localImages.add(new MyLocalImages(R.drawable.i));
        localImages.add(new MyLocalImages(R.drawable.j));
        localImages.add(new MyLocalImages(R.drawable.k));
        localImages.add(new MyLocalImages(R.drawable.l));

        return localImages;
    }
}
