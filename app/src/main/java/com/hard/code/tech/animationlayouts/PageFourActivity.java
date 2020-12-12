package com.hard.code.tech.animationlayouts;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hard.code.tech.animationlayouts.databinding.ActivityPageFourBinding;
import com.hard.code.tech.animationlayouts.fragments.HomeFragment;
import com.hard.code.tech.animationlayouts.fragments.ProfileFragment;
import com.hard.code.tech.animationlayouts.fragments.ShopFragment;

public class PageFourActivity extends AppCompatActivity implements ProfileFragment.OnFragmentInteractionListener {

    private final FragmentManager fragmentManager = getSupportFragmentManager();
    private final Fragment homeFrag = new HomeFragment();
    private final Fragment shopFragment = new ShopFragment();
    private final Fragment profileFragment = new ProfileFragment();

    private ActivityPageFourBinding activityPageFourBinding;
    private BottomNavigationView bottomNavigationMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPageFourBinding = DataBindingUtil.setContentView(this,R.layout.activity_page_four);

        initBottomNav();
    }

    private void initBottomNav() {
        bottomNavigationMenuView = activityPageFourBinding.bottomNavView;

        bottomNavigationMenuView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        fragment = homeFrag;
                        break;
                    case R.id.navigation_shop:
                        fragment = shopFragment;
                        break;
                    case R.id.navigation_profile:
                        fragment = profileFragment;
                        break;


                }
                assert fragment != null;

                fragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.enter_from_right,
                                R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right)
                        .replace(R.id.frameLayout, fragment)
                        //.addToBackStack(null)
                        .commit();
                return true;


            }


        });

        bottomNavigationMenuView.setSelectedItemId(R.id.navigation_home);



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
