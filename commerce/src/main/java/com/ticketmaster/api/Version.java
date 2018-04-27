package com.ticketmaster.api;

/**
 * Created by jingshanyin on 4/26/18.
 */
public class Version {

    public static final String SDK_VERSION = "0.1.7";

    public static final String getUserAgent() {
        return "Ticketmaster Commerce Java SDK/" + SDK_VERSION;
    }

    private Version() {
    }
}
