package com.hard.code.tech.animationlayouts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.databinding.DataBindingUtil;

import com.hard.code.tech.animationlayouts.databinding.ActivityMainBinding;

public class PageOneActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    AnimateLayoutListener animateLayoutListener, animateLayoutListener1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        animateLayoutListener = new AnimateLayoutListener(
                activityMainBinding.linearProfile,
                activityMainBinding.mainContent,
                activityMainBinding.imgUserPhoto,
                activityMainBinding.txtName,
                activityMainBinding.txtUserName,
                activityMainBinding.txtExplore,
                activityMainBinding.txtAddOns,
                activityMainBinding.txtMessages,
                activityMainBinding.txtSettings,
                activityMainBinding.txtSignOut);

        animateLayoutListener1 = new AnimateLayoutListener(
                activityMainBinding.mainContent,
                activityMainBinding.linearProfile,
                activityMainBinding.btnProfilePhoto,
                activityMainBinding.txtProfileName,
                activityMainBinding.txtProfileUserName,
                activityMainBinding.txtSmtin,
                activityMainBinding.txtSome,
                activityMainBinding.imgBell,
                activityMainBinding.imgVpn,
                activityMainBinding.imgForum,
                activityMainBinding.imgEdit,
                activityMainBinding.imgCloud,
                activityMainBinding.imgWhatsHot);

        activityMainBinding.setBtnSmallIcon(animateLayoutListener);
        activityMainBinding.setProfileLayout(animateLayoutListener1);
    }
}
