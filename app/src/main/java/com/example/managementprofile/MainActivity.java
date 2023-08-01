package com.example.managementprofile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.managementprofile.adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        viewPager = findViewById(R.id.viewPager);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0: bottomNavigationView.getMenu().findItem(R.id.mProfile).setChecked(true);
                    break;
                    case 1: bottomNavigationView.getMenu().findItem(R.id.mStudy).setChecked(true);
                    break;
                    case 2: bottomNavigationView.getMenu().findItem(R.id.mWork).setChecked(true);
                    break;
                    case 3: bottomNavigationView.getMenu().findItem(R.id.mAchive).setChecked(true);

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.mProfile: viewPager.setCurrentItem(0);
//                    break;
//                    case R.id.mStudy: viewPager.setCurrentItem(1);
//                    break;
//                    case R.id.mWork: viewPager.setCurrentItem(2);
//                    break;
//                    case R.id.mAchive: viewPager.setCurrentItem(3);
//                    break;
                }
//                return true;
//            }
//        });
    }
//}