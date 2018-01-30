package com.example.codetribe.itutourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by codeTribe on 7/26/2017.
 */

public class NewsFeedFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.newsfeed, container, false);

        TextView textView =(TextView)rootView.findViewById(R.id.newsFeed);
        textView.setText("The onset of spring and summer sees many South Africans putting on their traveling gear and taking to the roads, adventure bound, to explore and experience the sights, tastes and smells of our beautiful country.\n" +
                "\n" +
                "September is celebrated as Tourism Month  and government has been encouraging South Africans to travel within the country as part of growing domestic tourism.\n" +
                "\n" +
                "It is for this reason that the Industrial Development Corporation (IDC) has chosen this time of the year to open Limpopo’s first  ever 150 room Radisson Park Inn Hotel, in Polokwane.\n" +
                "\n" +
                "Regional Manager  at IDC Kgampi Bapela says the hospitality and tourism sector in Limpopo is growing at an alarming speed and this helps improve the province’s economic growth and outlook.\n" +
                "\n" +
                "He believes that the new top class hotel will boost accommodation infrastructure in the province as tourist numbers soar.\n" +
                "\n" +
                "Approximately R180 million was invested in the project, and its funding was approved by the IDC in 2014 for a local entrepreneur from Seshego, near Polokwane.\n" +
                "\n" +
                "“Over 700 jobs were created during construction and we are expecting about 150 permanent jobs to be created once the hotel is up and running,” says Bapela.\n" +
                "\n" +
                "He points out that 75%  of the popular Kruger National Park is in Limpopo, although people think it is Nelspruit in Mpumalanga, once you mention the park.\n" +
                "\n" +
                "“There is so much that the province has to offer in terms of tourism, not forgetting that there is a lot of activity in the private game breeding space, to which Limpopo contributes more than 70% in the country’s activity in that industry.\n" +
                "\n" +
                "“There is still a lot of untapped offer in the province in the tourism space,” he says.\n" +
                "\n" +
                "Bapela thinks that tourists are attracted to Limpopo because the province is bordering Zimbabwe and Botswana, and the province boosts some of the finest private game reserves, Kruger National Park, heritage sites such as Mapungubwe, and there is also space for hunting, among other things.\n" +
                "\n" +
                "But, people from the province are also known for their evident love for their culture and tradition, which may also be a point of interest to traditional enthusiasts.\n" +
                "\n" +
                "According to a consolidated report published by South African Tourism (SA Tourism) on the review of the performance of the tourism sector in 2015, Limpopo received the most trips as a destination province compared to other provinces in the country.\n" +
                "\n" +
                "However, there was a 23.1% decline in the number of trips received by the province in the same year.\n" +
                "\n" +
                "SA Tourism attributes the highest number of travels in SA to leisure, such as visiting friends and relatives. This is followed by travelling for holiday and shopping.\n" +
                "\n" +
                "“In 2015, the most popular activities undertaken by tourists were shopping, social activities and nightlife, which are generally common activities for tourists going to any destination,” says SA Tourism.\n" +
                "\n" +
                "The entity says barring these common activities, visiting natural attractions accounted for 15%, travelling for business 13%, beaches 11%, cultural and historical attractions 11% while a portion of people were attracted to wildlife.\n" +
                "\n" +
                "The report reveals that the increase in wildlife was observed across all regions, with the Americas and Asia growing the most in this regard.\n" +
                "\n" +
                "“Business-related activities were boosted primarily by Europe,” says SA Tourism.\n" +
                "\n" +
                "The month of September provides the tourism industry with the opportunity for a heightened focus on the importance of tourism to the local economy.\n" +
                "\n" +
                "It also serves as an opportunity to promote domestic tourism and create a culture of travel amongst South Africans.\n" +

                " ");

        return rootView;

    }

}
