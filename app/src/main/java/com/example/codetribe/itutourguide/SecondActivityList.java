package com.example.codetribe.itutourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivityList extends AppCompatActivity {

    int choose;
    String title;
    ListView listView;
    static String INDEX="in";
   static String CHOOSE ="CHO";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView =(ListView)findViewById(R.id.list);
        Intent intent = getIntent();

        choose =intent.getIntExtra(HomeFragment.CHOOSE,0);
        title =intent.getStringExtra(HomeFragment.TITTLE);


        if(choose ==1)
        {
            getSupportActionBar().setTitle(title);

            ArrayList<Word> words = new ArrayList<Word>();
            // words.add("one");
            words.add(new Word("Falcon Rock Spur","",R.drawable.falcon_rock_spur));
            words.add(new Word("Nguni Grill","",R.drawable.nguni_grill));
            words.add(new Word("The Dish","",R.drawable.the_dish));
            words.add(new Word("Ambiance Restaurant","",R.drawable.ambiance_resturant));
            words.add(new Word("Nando's Polokwane CBD","",R.drawable.nandos_cbd));
            words.add(new Word("The Farmyard Trading Post","",R.drawable.the_farmyard_trading));
            words.add(new Word("Adega Restaurant Polokwane","",R.drawable.adega_rest));
            words.add(new Word("Meropa Casino & Entertainment World","",R.drawable.meropa_casino));
            words.add(new Word("Mosate Lodge Polokwane","",R.drawable.mosate_lodge));
            words.add(new Word("Mawetse Fine Dining","",R.drawable.mawetse_fine));


            WordAdapter adapter = new WordAdapter(this,words,R.layout.activity_second_list);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    switch(i)
                    {
                        case 0:
                            Intent intent0 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent0.putExtra(INDEX,i);
                            intent0.putExtra(CHOOSE,choose);
                            startActivity(intent0);
                            break;
                       case 1:
                            Intent intent1 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent1.putExtra(INDEX,i);

                            startActivity(intent1);
                            break;
                        case 2:

                            Intent intent2 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent2.putExtra(INDEX,i);
                            startActivity(intent2);
                            break;
                        case 3:

                            Intent intent3 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent3.putExtra(INDEX,i);
                            startActivity(intent3);
                            break;
                        case 4:

                            Intent intent4 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent4.putExtra(INDEX,i);
                            startActivity(intent4);
                            break;
                        case 5:

                            Intent intent5 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent5.putExtra(INDEX,i);
                            startActivity(intent5);
                            break;
                        case 6:

                            Intent intent6 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent6.putExtra(INDEX,i);
                            startActivity(intent6);
                            break;
                        case 7:

                            Intent intent7 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent7.putExtra(INDEX,i);
                            startActivity(intent7);
                            break;
                        case 8:

                            Intent intent8 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent8.putExtra(INDEX,i);
                            startActivity(intent8);
                            break;
                        case 9:

                            Intent intent9 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent9.putExtra(INDEX,i);
                            startActivity(intent9);
                            break;
                    }

                }
            });
        }
        else if(choose ==2)
        {

            getSupportActionBar().setTitle(title);

            ArrayList<Word> words = new ArrayList<Word>();

            words.add(new Word("Protea Hotel by Marriott Polokwane Landmark","",R.drawable.protea_hotel_by_polokwane_landmark));
            words.add(new Word("Protea Hotel by Marriott Ranch Resor","",R.drawable.protea_hotel_by_ranch));
            words.add(new Word("Sleepers Villa","",R.drawable.sleepers_villa));
            words.add(new Word("Golden Pillow Overnight Accommodation","",R.drawable.golden_pillow_overnight));
            words.add(new Word("Polokwane Royal","",R.drawable.polokwane_royal));
            words.add(new Word("Fusion Boutique Hotel","",R.drawable.gallary));
            words.add(new Word("Miami Lodge","",R.drawable.miami_lodge));
            words.add(new Word("Reggies B&B","",R.drawable.reggies_b_n_b));
            words.add(new Word("Kings Castle","",R.drawable.kings_castle));
            words.add(new Word("Ruby Stone Boutique Hotel","",R.drawable.ruby_stone_botique));


            WordAdapter adapter = new WordAdapter(this,words,R.layout.activity_second_list);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                    switch(i)
                    {
                        case 0:
                            Intent intent0 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent0.putExtra(INDEX,i);
                            intent0.putExtra(CHOOSE,choose);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent1.putExtra(INDEX,i);
                            intent1.putExtra(CHOOSE,choose);
                            startActivity(intent1);
                            break;
                        case 2:

                            Intent intent2 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent2.putExtra(INDEX,i);
                            intent2.putExtra(CHOOSE,choose);
                            startActivity(intent2);
                            break;
                        case 3:

                            Intent intent3 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent3.putExtra(INDEX,i);
                            intent3.putExtra(CHOOSE,choose);
                            startActivity(intent3);
                            break;
                        case 4:

                            Intent intent4 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent4.putExtra(INDEX,i);
                            intent4.putExtra(CHOOSE,choose);
                            startActivity(intent4);
                            break;
                        case 5:

                            Intent intent5 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent5.putExtra(INDEX,i);
                            intent5.putExtra(CHOOSE,choose);
                            startActivity(intent5);
                            break;
                        case 6:

                            Intent intent6 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent6.putExtra(INDEX,i);
                            intent6.putExtra(CHOOSE,choose);
                            startActivity(intent6);
                            break;
                        case 7:

                            Intent intent7 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent7.putExtra(INDEX,i);
                            intent7.putExtra(CHOOSE,choose);
                            startActivity(intent7);
                            break;
                        case 8:

                            Intent intent8 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent8.putExtra(INDEX,i);
                            intent8.putExtra(CHOOSE,choose);
                            startActivity(intent8);
                            break;
                        case 9:

                            Intent intent9 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent9.putExtra(INDEX,i);
                            intent9.putExtra(CHOOSE,choose);
                            startActivity(intent9);
                            break;
                    }

                }
            });
        }
        else if(choose ==3)
        {

            getSupportActionBar().setTitle(title);

            ArrayList<Word> words = new ArrayList<Word>();

            words.add(new Word("Adventures with Elephants Bela Bela","",R.drawable.adventures_with_elephants_bela_bela));
            words.add(new Word("Ster-Kinekor","",R.drawable.sterkinerkor));
            words.add(new Word("Meropa casino &Entertainment World","",R.drawable.meropa_casino));
            words.add(new Word("Air Tours","",R.drawable.leading_edge_flight_school));
            words.add(new Word("Mapunguwe National Park ","",R.drawable.mapungubwe_national_park));
            words.add(new Word("Peter Mokaba Stadium","",R.drawable.peter_mokaba));
            words.add(new Word("Polokwane Gane Reserve","",R.drawable.polokwane_game_reserve));
            words.add(new Word(" Let's Go Bowling - The Farmyard","",R.drawable.lets_go_blowing));
            words.add(new Word("Mall of the North","",R.drawable.mall));
            words.add(new Word("Savanna Mall","",R.drawable.savanna));


            WordAdapter adapter = new WordAdapter(this,words,R.layout.activity_second_list);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    switch(i)
                    {
                        case 0:
                            Intent intent0 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent0.putExtra(INDEX,i);
                            intent0.putExtra(CHOOSE,choose);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent1.putExtra(INDEX,i);
                            intent1.putExtra(CHOOSE,choose);
                            startActivity(intent1);
                            break;
                        case 2:

                            Intent intent2 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent2.putExtra(INDEX,i);
                            intent2.putExtra(CHOOSE,choose);
                            startActivity(intent2);
                            break;
                        case 3:

                            Intent intent3 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent3.putExtra(INDEX,i);
                            intent3.putExtra(CHOOSE,choose);
                            startActivity(intent3);
                            break;
                        case 4:

                            Intent intent4 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent4.putExtra(INDEX,i);
                            intent4.putExtra(CHOOSE,choose);
                            startActivity(intent4);
                            break;
                        case 5:

                            Intent intent5 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent5.putExtra(INDEX,i);
                            intent5.putExtra(CHOOSE,choose);
                            startActivity(intent5);
                            break;
                        case 6:

                            Intent intent6 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent6.putExtra(INDEX,i);
                            intent6.putExtra(CHOOSE,choose);
                            startActivity(intent6);
                            break;
                        case 7:

                            Intent intent7 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent7.putExtra(INDEX,i);
                            intent7.putExtra(CHOOSE,choose);
                            startActivity(intent7);
                            break;
                        case 8:

                            Intent intent8 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent8.putExtra(INDEX,i);
                            intent8.putExtra(CHOOSE,choose);
                            startActivity(intent8);
                            break;
                        case 9:

                            Intent intent9 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent9.putExtra(INDEX,i);
                            intent9.putExtra(CHOOSE,choose);
                            startActivity(intent9);
                            break;
                    }

                }
            });

        }
        else if(choose == 4)
        {


            getSupportActionBar().setTitle(title);

            ArrayList<Word> words = new ArrayList<Word>();

            words.add(new Word("Polokwane Blackball Pool","",R.drawable.polokwane_black_pool));
            words.add(new Word("Ster-Kinekor","",R.drawable.sterkinerkor));
            words.add(new Word("Meropa casino &Entertainment World","",R.drawable.meropa_casino));
            words.add(new Word("Air Tours","",R.drawable.leading_edge_flight_school));
            words.add(new Word("Dagga Boys ","",R.drawable.dagga_boys));
            words.add(new Word("Peter Mokaba Stadium","",R.drawable.peter_mokaba));
            words.add(new Word("Polokwane Gane Reserve","",R.drawable.polokwane_game_reserve));
            words.add(new Word(" Let's Go Bowling - The Farmyard","",R.drawable.lets_go_blowing));
            words.add(new Word("Mall of the North","",R.drawable.mall));
            words.add(new Word("Savanna Mall","",R.drawable.savanna));


            WordAdapter adapter = new WordAdapter(this,words,R.layout.activity_second_list);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    switch(i)
                    {
                        case 0:
                            Intent intent0 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent0.putExtra(INDEX,i);
                            intent0.putExtra(CHOOSE,choose);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent1.putExtra(INDEX,i);
                            intent1.putExtra(CHOOSE,choose);
                            startActivity(intent1);
                            break;
                        case 2:

                            Intent intent2 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent2.putExtra(INDEX,i);
                            intent2.putExtra(CHOOSE,choose);
                            startActivity(intent2);
                            break;
                        case 3:

                            Intent intent3 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent3.putExtra(INDEX,i);
                            intent3.putExtra(CHOOSE,choose);
                            startActivity(intent3);
                            break;
                        case 4:

                            Intent intent4 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent4.putExtra(INDEX,i);
                            intent4.putExtra(CHOOSE,choose);
                            startActivity(intent4);
                            break;
                        case 5:

                            Intent intent5 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent5.putExtra(INDEX,i);
                            intent5.putExtra(CHOOSE,choose);
                            startActivity(intent5);
                            break;
                        case 6:

                            Intent intent6 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent6.putExtra(INDEX,i);
                            intent6.putExtra(CHOOSE,choose);
                            startActivity(intent6);
                            break;
                        case 7:

                            Intent intent7 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent7.putExtra(INDEX,i);
                            intent7.putExtra(CHOOSE,choose);
                            startActivity(intent7);
                            break;
                        case 8:

                            Intent intent8 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent8.putExtra(INDEX,i);
                            intent8.putExtra(CHOOSE,choose);
                            startActivity(intent8);
                            break;
                        case 9:

                            Intent intent9 =new Intent(SecondActivityList.this,ThirdActivity.class);
                            intent9.putExtra(INDEX,i);
                            intent9.putExtra(CHOOSE,choose);
                            startActivity(intent9);
                            break;
                    }

                }
            });





        }














    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
