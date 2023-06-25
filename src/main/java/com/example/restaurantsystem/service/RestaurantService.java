package com.example.restaurantsystem.service;

import com.example.restaurantsystem.model.Restaurant;
import com.example.restaurantsystem.model.Speciality;
import com.example.restaurantsystem.repositry.RestaurantRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepositry restaurantRepositry;

    public Restaurant getRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepositry.getAllRestaurant();
    }


    public String updateRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurant.setRestaurantSpeciality(Speciality.DAHI_BALLE);
                return "Speciality updated successfully";
            }
        }

        return "Unable to update Speciality";
    }

    public String deleteRestaurantById(Integer restaurantId) {
        List<Restaurant> restaurantList = getAllRestaurant();
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurantList.remove(restaurant);
                return "Restaurant removed successfully";
            }
        }
        return "Unable to find or delete the restaurant";
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> restaurantList = getAllRestaurant();
        restaurantList.addAll(restaurants);
        return "Restaurants added successfully";
    }
}
