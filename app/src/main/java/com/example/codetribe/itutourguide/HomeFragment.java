package com.example.codetribe.itutourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by codeTribe on 7/26/2017.
 */

public class HomeFragment extends Fragment {

    Button button2;
    Button button;
    Button button4;
    Button button3;

    int choose ;
    static  String CHOOSE="CHOOSE";
    String title;
    static  String TITTLE="TITTLE";

    Context context;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);
       // home = rootView.findViewById(R.id.text);

        button2 = rootView.findViewById(R.id.button2);
        button = rootView.findViewById(R.id.button);
        button4 = rootView.findViewById(R.id.button4);
        button3 = rootView.findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context ,SecondActivityList.class);
                intent.putExtra(CHOOSE,1);
                intent.putExtra(TITTLE,"The Eats");
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context ,SecondActivityList.class);
                intent.putExtra(CHOOSE,2);
                intent.putExtra(TITTLE,"Accomodations");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context ,SecondActivityList.class);
                intent.putExtra(CHOOSE,3);
                intent.putExtra(TITTLE,"Attractions");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context ,SecondActivityList.class);
                intent.putExtra(CHOOSE,4);
                intent.putExtra(TITTLE,"Entertainment");
                startActivity(intent);
            }
        });



        return rootView;

    }



}
