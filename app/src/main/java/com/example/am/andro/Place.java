package com.example.am.andro;

import android.support.v7.widget.RecyclerView;

/**
 * Created by am on 29.12.2017.
 */

public class Place {
    public String placeName;
    public int temperature;
    public String information;


    public Place(String placeName, int temperature, String information) {
        this.placeName = placeName;
        this.temperature = temperature;
        this.information = information;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


}


