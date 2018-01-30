package com.example.codetribe.itutourguide;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by codeTribe on 7/20/2017.
 */




    public class AndroidImageAdapter extends PagerAdapter {

        Context mContext;
        String[] text;



       public AndroidImageAdapter(Context context, String[] text) {
            this.mContext = context;
            this.text =text;
        }

        @Override
        public int getCount() {
            return sliderImagesId.length;
        }

        private int[] sliderImagesId = new int[]{
                R.drawable.isish_mesium,
                R.drawable.limpopo_polokwane_art_museum_stanislav_lvovsky2,
                R.drawable.animal,
                R.drawable.leading_edge_flight_school,
                R.drawable.polokwane_game_reserve,
                R.drawable.mall_of_north,
                R.drawable.hotels,
                R.drawable.gmt_318064,
                R.drawable.miami_lodge,
                R.drawable.thorn_bush,
                R.drawable.ruby_stone_botique,
                R.drawable.ambiance_resturant,
                R.drawable.polokwane_66,
                R.drawable.mount,
                R.drawable.polokwane_game_reserve_africa,
                R.drawable.polokwane_ptttt,
                R.drawable.polokwane_reptiles,
                R.drawable.attractions_nice,
                R.drawable.attractions

        };

        @Override
        public boolean isViewFromObject(View v, Object obj) {
            return v == ((ImageView) obj);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int i) {

            TextView txtText;

            ImageView mImageView = new ImageView(mContext);
            mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mImageView.setImageResource(sliderImagesId[i]);
            ((ViewPager) container).addView(mImageView, 0);
            txtText =(TextView)mImageView.findViewById(R.id.text);
            //txtText.setText(text[i]);

            return mImageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int i, Object obj) {
            ((ViewPager) container).removeView((ImageView) obj);
        }
    }

