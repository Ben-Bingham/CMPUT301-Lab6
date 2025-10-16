package com.example.listycity;

/**
 * Defines a City, and its province.
 * @author Benjamin Bingham
 * @version 1.0
 *
 */
public class City {
    private String city;
    private String province;

    /**
     * Constructs a city given the city name and its province.
     * @param city      The name of the city.
     * @param province  The name of the province the city is in.
     * @since 1.0
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city's name.
     * @return The name of the city.
     * @since 1.0
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the province's name.
     * @return The province the city is in.
     * @since 1.0
     */
    String getProvinceName(){
        return this.province;
    }
}

