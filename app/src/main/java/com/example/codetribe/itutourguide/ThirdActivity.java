package com.example.codetribe.itutourguide;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.codetribe.itutourguide.R.id.textView;

public class ThirdActivity extends AppCompatActivity {

    int index;
    int choose;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ratingBar =(RatingBar)findViewById(R.id.ratingBar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent =getIntent();
        TextView textView;
        ImageView imageView;

        index=intent.getIntExtra(SecondActivityList.INDEX,0);
        choose =intent.getIntExtra(SecondActivityList.CHOOSE,1);

        textView =(TextView)findViewById(R.id.directions);
        imageView =(ImageView)findViewById(R.id.image);


        if(choose ==1)
        {
            switch (index)
            {

                case 0:
                    getSupportActionBar().setTitle("Falcon Rock Spur");
                    ratingBar.setRating(4);
                    textView.setText("US-style diner chain with a family-friendly vibe, dishing up steaks, burgers, ribs and wings.\n" +
                            "Address: Shop G37, Savannah Centre, Cnr Grimm & Thabo Mbeki St, Fauna Park, Polokwane, 0787 \n" +
                            "Hours: Open today · 9AM–9PM\n" +
                            "Phone: 015 296 1991");
                    imageView.setImageResource(R.drawable.falcon_rock_spur);

                    break;
                case 1:
                    getSupportActionBar().setTitle("Nguni Grill");
                    ratingBar.setRating(4);
                    textView.setText("Address: 28 Morris St, Bendor Park, Polokwane, 0713\n" +
                            "Hours: Open today · 9AM–11PM\n" +
                            "Phone: 015 296 1790");
                    imageView.setImageResource(R.drawable.nguni_grill);
                    break;
                case 2:
                    getSupportActionBar().setTitle("The Dish");
                    ratingBar.setRating(3);
                    textView.setText("Address: 43 Rissik St, Polokwane Central, Polokwane, 0700\n" +
                            "Phone: 079 553 3790");
                    imageView.setImageResource(R.drawable.the_dish);
                    break;
                case 3:
                    getSupportActionBar().setTitle("Ambiance Restaurant");
                    textView.setText("Address: 34A Rabe St, Polokwane Central, Polokwane, 0700\n" +
                            "Hours: Open today · 8AM–8PM\n" +
                            "Phone: 015 291 4012");
                    ratingBar.setRating(4);
                    imageView.setImageResource(R.drawable.ambiance_resturant);
                    break;
                case 4:
                    getSupportActionBar().setTitle("Nandos's Polokwane CBD");
                    textView.setText("Afro-Portuguese chain restaurant serving flame-grilled chicken in spicy chilli sauce.\n" +
                            "Address: 60 Schoeman St, Pietersburg, Polokwane, 0700\n" +
                            "Phone: 015 295 6124\n" +
                            "Hours: Open today · 9AM–9PM");
                    imageView.setImageResource(R.drawable.nandos_cbd);
                    break;
                case 5:
                    getSupportActionBar().setTitle("The Farmyard Trading Post");
                    ratingBar.setRating(5);
                    textView.setText("Address: Cnr Munnik and School roads,, Bendor Extention 115 ( next to Mall of the North, Polokwane, 0700\n" +
                            "Phone: 015 296 0216");
                    imageView.setImageResource(R.drawable.the_farmyard_trading);
                    break;
                case 6:
                    getSupportActionBar().setTitle("Adega Restaurant Polokwane");
                    ratingBar.setRating(3);
                    textView.setText("Address: Pierre St & Neethling St, Bendor Park, Polokwane, 0700\n" +
                            "Hours: Open today · 9AM–10PM\n" +
                            "Phone: 015 296 0805");
                    imageView.setImageResource(R.drawable.adega_rest);
                    break;
                case 7:
                    getSupportActionBar().setTitle("Meropa Casino & Entertainment Woeld");
                    ratingBar.setRating(3);
                    textView.setText("Address: 59 Prov Roodepoort St, Ivypark X14, Polokwane, 0699\n" +
                            "Hours: Open today · Open 24 hours\n" +
                            "Phone: 015 290 5400");
                    imageView.setImageResource(R.drawable.meropa_casino);
                    break;
                case 8:
                    getSupportActionBar().setTitle("Mosate Lodge PLK");
                    ratingBar.setRating(2);
                    textView.setText("This modern, low-rise hotel offers contemporary rooms in earthy tones, plus a buffet restaurant.\n" +
                            "34A Grobler St\n" +
                            "015 291 1004\n" +
                            "Quiet · Cosy · Casual\n" +
                            "Open 24 hours");
                    imageView.setImageResource(R.drawable.mosate_lodge);
                    break;
                case 9:
                    ratingBar.setRating(2);
                    getSupportActionBar().setTitle("Mawetse Fine Dining");
                    textView.setText("Address: 54 Jorissen St, Polokwane Central, Polokwane, 0700\n" +
                            "Hours: Open today · 1–3PM, 5–9PM\n" +
                            "Phone: 015 297 4439");
                    imageView.setImageResource(R.drawable.mawetse_fine);
                    break;

            }

        }

        else if(choose ==2)
        {
            switch (index)
            {

                case 0:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Protea Hotel");
                    textView.setText("· 3-star hotel\n" +
                            "Bright rooms at a low-rise hotel with a pair of restaurants, a patio and a pool."+"Address: N1 Northbound, Polokwane (Pietersburg), 0700\n" +
                            "Phone: 015 225 8100");
                    imageView.setImageResource(R.drawable.protea_hotel_by_polokwane_landmark);

                    break;
                case 1:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Protea Hotel");
                    textView.setText("");
                    imageView.setImageResource(R.drawable.protea_hotel_by_ranch);
                    break;
                case 2:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Sleepers Villa ");
                    textView.setText("Address: 20A Bok St, Polokwane Central, Polokwane, 0699\n" +
                            "Phone: 015 291 5285");
                    imageView.setImageResource(R.drawable.sleepers_villa);
                    break;

                case 3:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Golden Pillow Overnight Accommodation");
                    textView.setText("Address: 57 Thabo Mbeki St, Polokwane Central, Polokwane, 0700\n" +
                            "Hours: Open today · 6:30AM–9:30PM\n" +
                            "Phone: 015 295 2970");
                    imageView.setImageResource(R.drawable.golden_pillow_overnight);
                    break;

                case 4:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Polokwane Royal");
                    textView.setText("Address: Dorp St, Polokwane Central, Polokwane, 0699\n" +
                            "Phone: 015 297 6634");
                    imageView.setImageResource(R.drawable.polokwane_royal);
                    break;

                case 5:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Fusion Boutique Hotel");
                    textView.setText(" 5-star hotel\n" +
                            "Lavish suites with free-standing baths, plus an upscale restaurant, a terrace bar & a wine cellar. \n"+"Address: 4 Schoeman St, Polokwane Central, Polokwane, 699\n" +
                            "Phone: 015 291 4042");
                    imageView.setImageResource(R.drawable.ruby_stone_botique);
                    break;
                case 6:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Miami Lodge");
                    textView.setText(" Lodge\n" +
                            "Straightforward rooms in a low-key hotel offering a relaxed restaurant, a bar & 6 meeting rooms.\n" +
                            "159 Marshall Street\n" +
                            "015 291 4290");
                    imageView.setImageResource(R.drawable.miami_lodge);
                    break;

                case 7:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Reggies B&B");
                    textView.setText(" Bed & Breakfast\n" +
                            "88 Oost St\n" +
                            "082 926 1087");
                    imageView.setImageResource(R.drawable.reggies_b_n_b);
                    break;

                case 8:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Kings Castle");
                    textView.setText("Address: 40 Grobler St, Polokwane Central, Polokwane, 0699\n" +
                            "Phone: 015 291 2055");
                    imageView.setImageResource(R.drawable.kings_castle);
                    break;

                case 9:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Ruby Stone Boutique Hotel");
                    textView.setText("10 million+ Hotel Real Reviews Check Hotel Rates & Book Now!\n" +
                            "Amenities: Spa, Sauna, TV & Cable, Breakfast\n" +
                            "Readers' top pick for Best Online Travel Service 2017 – asiaone");
                    imageView.setImageResource(R.drawable.ruby_stone_botique);
                    break;




            }
        }
        else if(choose == 3)
        {



            switch (index)
            {

                case 0:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Adventures with Elephants");
                    textView.setText("Address: D1000 Rd, Mabula District, Bela Bela, 0480\n" +
                            "Hours: Closing soon · 8AM–3PM\n" +
                            "Phone: 014 734 7730");
                    imageView.setImageResource(R.drawable.adventures_with_elephants_bela_bela);

                    break;
                case 1:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Ster -kinekor");
                    textView.setText("Address: R81, Polokwane, 0699\n" +
                            "Phone: 015 265 1195");
                    imageView.setImageResource(R.drawable.sterkinerkor);
                    break;
                case 2:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Meropa casino & Entertainment");
                    textView.setText("Address: 59 Prov Roodepoort St, Ivypark X14, Polokwane, 0699\n" +
                            "Phone: 015 290 5400\n" +
                            "Hours: Open today · Open 24 hours5");
                    imageView.setImageResource(R.drawable.meropa_casino);
                    break;

                case 3:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Air Tours");
                    textView.setText("Address: 57 Thabo Mbeki St, Polokwane Central, Polokwane, 0700\n" +
                            "Hours: Open today · 6:30AM–9:30PM\n" +
                            "Phone: 015 295 2970");
                    imageView.setImageResource(R.drawable.leading_edge_flight_school);
                    break;

                case 4:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Mpunguwe National Park");
                    textView.setText("Mapungubwe National Park is a national park in Limpopo Province, South Africa. It is located by the Kolope River, south of the confluence of the Limpopo and Shashe rivers and about 15 km to the NE of the Venetia Diamond Mine. Wikipedia\n" +
                            "Address: Musina, 900\n" +
                            "Area: 280 km²\n" +
                            "Phone: 015 534 7923\n" +
                            "Established: 1995");
                    imageView.setImageResource(R.drawable.mapungubwe_national_park);
                    break;

                case 5:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Peter Mokaba Stadium");
                    textView.setText("The Peter Mokaba Stadium is a football and rugby union stadium in Polokwane, South Africa, that was used for the 2010 FIFA World Cup. Wikipedia\n" +
                            "Address: Polokwane\n" +
                            "Capacity: 46,000\n" +
                            "Opened: 2010\n" +
                            "Phone: 072 915 5485\n" +
                            "Owner: Polokwane, Limpopo");
                    imageView.setImageResource(R.drawable.peter_mokaba);
                    break;
                case 6:
                    ratingBar.setRating(5);
                    getSupportActionBar().setTitle("Polokwane Game Reserve");
                    textView.setText("Polokwane Game Reserve, is situated near Pietersburg, or Polokwane, as it is called nowadays, in the Limpopo, province of South Africa, and is one of the largest municipal Game Reserves in the country. Wikipedia\n" +
                            "Address: Polokwane\n" +
                            "Hours: Open today · 6AM–6PM\n" +
                            "Phone: 015 290 2331\n" +
                            "Established: 1977");
                    imageView.setImageResource(R.drawable.polokwane_game_reserve);
                    break;

                case 7:
                    ratingBar.setRating(5);
                    getSupportActionBar().setTitle("Lets Go Bowling-The Farmyard");
                    textView.setText("Address: The Farmyard Trading Post, Munnik Ave & School Rd, Bendor, Polokwane, 0700\n" +
                            "Hours: Open today · 10AM–10PM\n" +
                            "Phone: 015 296 1353");
                    imageView.setImageResource(R.drawable.lets_go_blowing);
                    break;

                case 8:
                    ratingBar.setRating(3);
                    getSupportActionBar().setTitle("Mall of the North");
                    textView.setText("Address: Cnr R81 & N1, Bendor Park, Polokwane, 0699\n" +
                            "Hours: Open today · 9AM–7PM\n" +
                            "Phone: 015 265 1026");
                    imageView.setImageResource(R.drawable.mall_of_north);
                    break;

                case 9:
                    ratingBar.setRating(4);
                    getSupportActionBar().setTitle("Savanna Mall");
                    textView.setText("Address: Thabo Mbeki St & Grimm Street, Fauna Park, Polokwane, 0699\n" +
                            "Hours: Open today · 9AM–6PM\n" +
                            "Phone: 015 296 1401");
                    imageView.setImageResource(R.drawable.savanna);
                    break;




            }








        }
        else
        {
            switch (index)
            {


               
                case 0:
                    getSupportActionBar().setTitle("Polokwane Blackball Pool");
                    textView.setText("Address: 1a hospital street behind game, Polokwane, 0699\n" +
                            "Phone: 083 635 0586");
                    imageView.setImageResource(R.drawable.polokwane_black_pool);

                    break;
                case 1:
                    getSupportActionBar().setTitle("Ster -kinekor");
                    textView.setText("Address: R81, Polokwane, 0699\n" +
                            "Phone: 015 265 1195");
                    imageView.setImageResource(R.drawable.sterkinerkor);
                    break;
                case 2:
                    getSupportActionBar().setTitle("Meropa casino & Entertainment");
                    textView.setText("Address: 59 Prov Roodepoort St, Ivypark X14, Polokwane, 0699\n" +
                            "Phone: 015 290 5400\n" +
                            "Hours: Open today · Open 24 hours5");
                    imageView.setImageResource(R.drawable.meropa_casino);
                    break;

                case 3:
                    getSupportActionBar().setTitle("Dagga Boys");
                    textView.setText("Address: 42A Grobler St, Polokwane Central, Polokwane, 0700\n" +
                            "Hours: Open today · 9AM–10PM");
                    imageView.setImageResource(R.drawable.dagga_boys);
                    break;

                case 4:
                    getSupportActionBar().setTitle("Mpunguwe National Park");
                    textView.setText("Mapungubwe National Park is a national park in Limpopo Province, South Africa. It is located by the Kolope River, south of the confluence of the Limpopo and Shashe rivers and about 15 km to the NE of the Venetia Diamond Mine. Wikipedia\n" +
                            "Address: Musina, 900\n" +
                            "Area: 280 km²\n" +
                            "Phone: 015 534 7923\n" +
                            "Established: 1995");
                    imageView.setImageResource(R.drawable.mapungubwe_national_park);
                    break;

                case 5:
                    getSupportActionBar().setTitle("Peter Mokaba Stadium");
                    textView.setText("The Peter Mokaba Stadium is a football and rugby union stadium in Polokwane, South Africa, that was used for the 2010 FIFA World Cup. Wikipedia\n" +
                            "Address: Polokwane\n" +
                            "Capacity: 46,000\n" +
                            "Opened: 2010\n" +
                            "Phone: 072 915 5485\n" +
                            "Owner: Polokwane, Limpopo");
                    imageView.setImageResource(R.drawable.peter_mokaba);
                    break;
                case 6:
                    getSupportActionBar().setTitle("Polokwane Game Reserve");
                    textView.setText("Polokwane Game Reserve, is situated near Pietersburg, or Polokwane, as it is called nowadays, in the Limpopo, province of South Africa, and is one of the largest municipal Game Reserves in the country. Wikipedia\n" +
                            "Address: Polokwane\n" +
                            "Hours: Open today · 6AM–6PM\n" +
                            "Phone: 015 290 2331\n" +
                            "Established: 1977");
                    imageView.setImageResource(R.drawable.polokwane_game_reserve);
                    break;

                case 7:
                    getSupportActionBar().setTitle("Lets Go Bowling-The Farmyard");
                    textView.setText("Address: The Farmyard Trading Post, Munnik Ave & School Rd, Bendor, Polokwane, 0700\n" +
                            "Hours: Open today · 10AM–10PM\n" +
                            "Phone: 015 296 1353");
                    imageView.setImageResource(R.drawable.lets_go_blowing);
                    break;

                case 8:
                    getSupportActionBar().setTitle("Mall of the North");
                    textView.setText("Address: Cnr R81 & N1, Bendor Park, Polokwane, 0699\n" +
                            "Hours: Open today · 9AM–7PM\n" +
                            "Phone: 015 265 1026");
                    imageView.setImageResource(R.drawable.mall_of_north);
                    break;

                case 9:
                    getSupportActionBar().setTitle("Savanna Mall");
                    textView.setText("Address: Thabo Mbeki St & Grimm Street, Fauna Park, Polokwane, 0699\n" +
                            "Hours: Open today · 9AM–6PM\n" +
                            "Phone: 015 296 1401");
                    imageView.setImageResource(R.drawable.savanna);
                    break;




            }


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



    public void directions(View v)
    {

        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
}
