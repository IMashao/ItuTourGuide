package com.example.codetribe.itutourguide;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by codeTribe on 7/26/2017.
 */

public class GalleryFragment extends Fragment {

    int currentPage = 0;
    final Handler handler = new Handler();
    Timer timer;

    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.

    String[] texts ;
    TextView textView;
    ViewPager mViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.gallary, container, false);

        texts = new String[]{"isish mesium","art_museum_stanislav_lvovsky","mokopane biodivercity center",
                "polokwane_bird_park","polokwane_game_reserve","Mall of the North","rapsodu_resturant","","","","","","","","","","","",""};
        textView = (TextView) rootView.findViewById(R.id.text);

         mViewPager =  rootView.findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(GalleryFragment.this.getContext(),texts);
        mViewPager.setAdapter(adapterView);





        //getting a auto image rotator from the Gallary Tab

        final Runnable Update = new Runnable() {

            public void run() {
                if (currentPage == texts.length -1) {
                    currentPage = 0;
                }
                mViewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer .schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(Update);
            }
        }, 500, 3000);





        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                Log.i("Ygritte","Selected Page is : "+position);

                textView.setText(texts[position]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        return rootView;

        }






    }
