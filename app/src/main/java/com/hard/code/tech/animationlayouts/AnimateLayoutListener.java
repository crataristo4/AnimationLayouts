package com.hard.code.tech.animationlayouts;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.hard.code.tech.animationlayouts.activities.CeramicsActivity;
import com.skyfishjy.library.RippleBackground;

import de.hdodenhof.circleimageview.CircleImageView;

public class AnimateLayoutListener {

    private LinearLayoutCompat mainContent, sideBar;
    private ConstraintLayout constraintLayout;
    private Animation fromTop, fromBottom;
    private CircleImageView photo;
    private TextView name, userName, txtExplore, txtMsgs, txtAddOns, txtSignOut, txtSettings;
    private Context context;

    public AnimateLayoutListener(Context context) {
        this.context = context;
    }

    AnimateLayoutListener(LinearLayoutCompat mainContent, LinearLayoutCompat sideBar,
                          CircleImageView photo, TextView name, TextView userName, TextView txtExplore, TextView txtAddOns,
                          TextView txtMsgs, TextView txtSettings, TextView txtSignOut) {
        this.mainContent = mainContent;
        this.sideBar = sideBar;
        this.photo = photo;
        this.name = name;
        this.userName = userName;
        this.txtExplore = txtExplore;
        this.txtMsgs = txtMsgs;
        this.txtAddOns = txtAddOns;
        this.txtSignOut = txtSignOut;
        this.txtSettings = txtSettings;
    }

    public void onSmallBtnSelected(View view) {
        mainContent.animate().translationX(0);
        sideBar.animate().translationX(0);

        fromTop = AnimationUtils.loadAnimation(view.getContext(), R.anim.from_top);
        fromBottom = AnimationUtils.loadAnimation(view.getContext(), R.anim.from_bottom);

        //animate from bottom
        photo.startAnimation(fromBottom);
        name.startAnimation(fromBottom);
        userName.startAnimation(fromBottom);

        //animate from top
        txtExplore.startAnimation(fromTop);
        txtAddOns.startAnimation(fromTop);
        txtMsgs.startAnimation(fromTop);
        txtSettings.startAnimation(fromTop);
        txtSignOut.startAnimation(fromTop);


    }


    private ImageView imgBell, imgVpn, imgForum, imgEdit, imgCloud, imgWhatsHot;
    private Animation slideInLeft, slideInRight;
    private TextView txtProfileName, txtProfileUserName, txtSomething, txtAnother;
    private CircleImageView imgProfilePhoto;


    AnimateLayoutListener(LinearLayoutCompat mainContent,
                          LinearLayoutCompat sideBar,
                          CircleImageView imgProfilePhoto,
                          TextView txtProfileName,
                          TextView txtProfileUserName,
                          TextView txtSomething,
                          TextView txtAnother,
                          ImageView imgBell, ImageView imgVpn,
                          ImageView imgForum,
                          ImageView imgEdit, ImageView imgCloud,
                          ImageView imgWhatsHot) {


        this.mainContent = mainContent;
        this.sideBar = sideBar;
        this.imgProfilePhoto = imgProfilePhoto;
        this.txtProfileName = txtProfileName;
        this.txtProfileUserName = txtProfileUserName;
        this.txtSomething = txtSomething;
        this.txtAnother = txtAnother;
        this.imgBell = imgBell;
        this.imgVpn = imgVpn;
        this.imgForum = imgForum;
        this.imgEdit = imgEdit;
        this.imgCloud = imgCloud;
        this.imgWhatsHot = imgWhatsHot;
    }

    public void onProfileLayoutSelected(View view) {
        mainContent.animate().translationX(-350);
        sideBar.animate().translationX(-500);

        slideInLeft = AnimationUtils.loadAnimation(view.getContext(), R.anim.slideinleft);
        slideInRight = AnimationUtils.loadAnimation(view.getContext(), R.anim.slideinright);

        fromTop = AnimationUtils.loadAnimation(view.getContext(), R.anim.from_top);
        fromBottom = AnimationUtils.loadAnimation(view.getContext(), R.anim.from_bottom);

        //slide in left items
        imgBell.startAnimation(slideInLeft);
        imgForum.startAnimation(slideInLeft);
        imgEdit.startAnimation(slideInLeft);

        //slide in right
        imgCloud.startAnimation(slideInRight);
        imgVpn.startAnimation(slideInRight);
        imgWhatsHot.startAnimation(slideInRight);

        //slide bottom up
        imgProfilePhoto.startAnimation(fromBottom);
        txtProfileName.startAnimation(fromBottom);
        txtProfileUserName.startAnimation(fromBottom);

        //slide top down
        txtSomething.startAnimation(fromTop);
        txtAnother.startAnimation(fromTop);

    }

    public void onPageOneBtnClicked(View view) {
        view.getContext().startActivity(new Intent(context, PageOneActivity.class));
    }

    public void onPageTwoBtnClicked(View view) {
        view.getContext().startActivity(new Intent(context, PageTwoActivity.class));
    }

    public void onPageThreeBtnClicked(View view) {
        view.getContext().startActivity(new Intent(context, PageThreeActivity.class));
    }

    public void onPageFourBtnClicked(View view) {
        view.getContext().startActivity(new Intent(context, PageFourActivity.class));
    }


    public void onPageFiveBtnClicked(View view) {
        view.getContext().startActivity(new Intent(context, CeramicsActivity.class));
    }


    private RippleBackground rippleBackground;

    public AnimateLayoutListener(RippleBackground rippleBackground) {
        this.rippleBackground = rippleBackground;
    }

    public void onEmergencyPressed(View view) {
        rippleBackground.startRippleAnimation();
        MediaPlayer mediaPlayer = MediaPlayer.create(view.getContext(), R.raw.alarm);
        mediaPlayer.start();
    }


}
