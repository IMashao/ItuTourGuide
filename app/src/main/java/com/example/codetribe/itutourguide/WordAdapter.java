package com.example.codetribe.itutourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by codeTribe on 6/28/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {
        super(context,0,words);
        mColorResourceId =colorResourceId;

    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View listItemView =convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word currentWord =getItem(position);
        TextView miwokTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTransalation());

        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);


        if(currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer =listItemView.findViewById(R.id.text_container);
       // int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
