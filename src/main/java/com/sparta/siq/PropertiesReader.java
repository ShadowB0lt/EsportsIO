package com.sparta.siq;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private final static String PROPAPIKEY = "api_key";
    private final static String PROPBASEURL = "base_url";
    private final static String PROPAPIACCESSQUERY = "api_token_query";
    private final static String PROPMATCHESENDPOINT = "matches_endpoint";
    private final static String FILE_LOC = "resources/my.properties";

    private static String apiKey;
    private static String baseURL;
    private static String apiAccessQuery;
    private static String matchesEndpoint;

    private PropertiesReader() {

    }

    private static void setup() {
        Properties appProperties = new Properties();
        try {
            appProperties.load(new FileReader(FILE_LOC));
        } catch (IOException e) {
            e.printStackTrace();
        }
        apiKey = appProperties.getProperty(PROPAPIKEY);
        baseURL = appProperties.getProperty(PROPBASEURL);
        apiAccessQuery = appProperties.getProperty(PROPAPIACCESSQUERY);
        matchesEndpoint = appProperties.getProperty(PROPMATCHESENDPOINT);
    }

    public static String getApiKey() {
        if (apiKey == null) {
            setup();
        }
        return apiKey;
    }

    public static String getBaseURL() {
        if (baseURL == null) {
            setup();
        }
        return baseURL;
    }

    public static String getMatchesEndpoint() {
        if (matchesEndpoint == null) {
            setup();
        }
        return matchesEndpoint;
    }

    public static String getApiAccessQuery() {
        if (apiAccessQuery == null) {
            setup();
        }
        return apiAccessQuery;
    }
}
