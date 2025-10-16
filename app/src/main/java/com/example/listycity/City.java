package com.example.listycity;

/**
 * Defines a City, and its province.
 * @version 1.0
 */
public class City implements Comparable {
    /**
     * The name of the city.
     */
    private String city;
    /**
     * The name of the province the city is in.
     */
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

    /**
     * Compares the current object to the object o
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

}

