package com.aavidsoft.recyclerview2;

import java.io.Serializable;

public class City implements Serializable {
    private int imageId;
    private String name;
    private String state;
    private long population;
    double lat, lng;
    private String description;

    public static final String KEY_CITY = "city";

    public City(int imageId, String name, String state, long population, double lat, double lng, String description) {
        this.imageId = imageId;
        this.name = name;
        this.state = state;
        this.population = population;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
