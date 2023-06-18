package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Weather {
    private String city;
    private String date;

    @JsonIgnoreProperties(ignoreUnknown = true)

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }
}
