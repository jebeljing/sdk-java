package com.ticketmaster.nbateams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by jingshanyin on 4/22/18.
 */

@ToString
@Getter
@AllArgsConstructor
public enum NBATEAMS {

    ALTANTA(0, "Atlanta Hawks", "Philips Arena"),
    BOSTON(1, "Boston Celtics", "TD Garden"),
    BROOKLYN(2, "Brooklyn Nets", "Barclays Center"),
    CHARLOTTE(3, "Charlotte Hornets", "Spectrum Center"),
    CHICAGO(4, "Chicago Bulls", "United Center"),
    CLEVELAND(5, "Cleveland Cavaliers", "Quicken Loans Arena"),
    DALLAS(6, "Dallas Mavericks", "American Airlines Center"),
    DENVER(7, "Denver Nuggets", "Pepsi Center"),
    DETROIT(8, "Detroit Pistons", "Little Caesars Arena"),
    GOLDENSTATE(9, "Golden State Warriors", "Oracle Arena"),
    HOUSTON(10, "Houston Rockets", "Toyota Center - TX"),
    INDIANA(11, "Indiana Pacers", "Bankers Life Fieldhouse"),
    LA(12, "LA Clippers", "Staples Center"),
    LOSANGELES(13, "Los Angeles Lakers", "Staples Center"),
    MEMPHIS(14, "Memphis Grizzlies", "FedExForum"),
    MIAMI(15, "Miami Heat", "AmericanAirlines Arena"),
    MILWAUKEE(16, "Milwaukee Bucks", "BMO Harris Bradley Center"),
    MINNESOTA(17, "Minnesota Timberwolves", "Target Center"),
    NEWORLEANS(18, "New Orleans Pelicans", "Smoothie King Center"),
    NEWYORK(19, "New York Knicks", "Madison Square Garden"),
    OKLAHOMACITY(20, "Oklahoma City Thunder", "Chesapeake Energy Arena"),
    ORLANDO(21, "Orlando Magic", "Amway Center"),
    PHILADELPHIA(22, "Philadelphia 76ers", "Wells Fargo Center-PA"),
    PHOENIX(23, "Phoenix Suns", "Talking Stick Resort Arena"),
    PORTLAND(24, "Portland Trail Blazers", "Moda Center"),
    SACRAMENTO(25, "Sacramento Kings", "Golden 1 Center"),
    SANANTONIO(26, "San Antonio Spurs", "AT&T Center"),
    TORONTO(27, "Toronto Raptors", "Air Canada Centre"),
    UTAH(28, "Utah Jazz", "Vivint Smart Home Arena"),
    WASHINGTON(29, "Washington Wizards", "Capital One Arena");


    private int id;
    private String team;
    private String vevue;
}
