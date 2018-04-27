package com.ticketmaster.nbaevents;

import com.ticketmaster.api.discovery.DiscoveryApi;
import com.ticketmaster.api.discovery.operation.SearchEventsOperation;
import com.ticketmaster.api.discovery.response.PagedResponse;
import com.ticketmaster.discovery.model.Event;
import com.ticketmaster.discovery.model.EventStatusEnum;
import com.ticketmaster.discovery.model.Events;
import com.ticketmaster.nbateams.NBATEAMS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jingshanyin on 4/22/18.
 */
public class SampleSearch {

    private static Logger logger = LoggerFactory.getLogger(SampleSearch.class);
    private static String apikey = "cenRmyZndqAdEwzqpAGcxsDttrwAmh07";
    private static String segment = "Sports";
    private static String genre = "Basketball";
    private static String subGenre = "NBA";

    public static void main(String[] args) throws IOException {
        DiscoveryApi api = new DiscoveryApi(apikey);

        for (NBATEAMS team: NBATEAMS.values()) {
            PagedResponse<Events> page = api.searchEvents(new SearchEventsOperation().keyword(team.getTeam()));
            if (page.getContent() == null) continue;
            List<Event> events = page.getContent().getEvents().stream()
                .filter(event -> event.getClassifications().get(0).getSegment().getName().equals(segment)
                    && event.getClassifications().get(0).getGenre().getName().equals(genre)
                    && event.getClassifications().get(0).getSubGenre().getName().equals(subGenre))
                .filter(event -> event.getVenues().get(0).getName().equals(team.getVevue()))
                .filter(event -> event.getDates().getStatus().getCode() != EventStatusEnum.CANCELLED)
//                .filter(event -> event.getDates().getStatus().getCode() != EventStatusEnum.OFFSALE)
                .filter(event -> event.getAttractions().size() == 2)
                .collect(Collectors.toList());
            if (events.isEmpty()) continue;
//            System.out.println(page.getRateLimit());
//            System.out.println("Team: " + team.getTeam() + ", Events: " + events.size());
//            System.out.println("\tPlaces: ");
            for (Event event: events) {
//                System.out.println("\t" + event.getVenues().get(0).getName() + ", ID=" + event.getId());
                System.out.println(event.getId() + "," + team.getTeam() + "," + event.getVenues().get(0).getName());
            }
        }
    }
}
