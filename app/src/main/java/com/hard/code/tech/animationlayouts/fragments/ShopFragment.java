package com.hard.code.tech.animationlayouts.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.hard.code.tech.animationlayouts.R;
import com.hard.code.tech.animationlayouts.databinding.FragmentShopBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {

    FragmentShopBinding fragmentShopBinding;
    //Animation
    private Animation fromTop, fromBottom, fromLeft, fromRight;

    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentShopBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_shop, container, false);
        return fragmentShopBinding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//animation
        fromTop = AnimationUtils.loadAnimation(getActivity(), R.anim.from_top);
        fromBottom = AnimationUtils.loadAnimation(getActivity(), R.anim.from_bottom);
        fromLeft = AnimationUtils.loadAnimation(getActivity(), R.anim.slideinleft);
        fromRight = AnimationUtils.loadAnimation(getActivity(), R.anim.slideinright);

        //from bottom
        fragmentShopBinding.textView9.startAnimation(fromBottom);
        fragmentShopBinding.textView8.startAnimation(fromBottom);

        //from top
        fragmentShopBinding.materialCardView.startAnimation(fromTop);

        //from left to right
        fragmentShopBinding.nestedScroll.startAnimation(fromLeft);
    }
}
