package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 * @version 2.1
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city This is a candidate city to add
     * @since 1.0
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     * @since 1.0
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This says whether or not the given city is already in the list.
     * @param city The city to check.
     * @return True if the list contains the city, false otherwise.
     * @since 2.0
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes the given city from the list.
     * @param city The city to remove from the list.
     * @since 2.0
     */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new IllegalArgumentException();
        }

        cities.remove(city);
    }

    /**
     * Gets the number of cities in the list.
     * @return The number of cities in the list.
     * @since 2.1
     */
    public int countCities() {
        return cities.size();
    }
}
