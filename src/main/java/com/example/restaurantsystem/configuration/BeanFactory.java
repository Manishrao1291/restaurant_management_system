package com.example.restaurantsystem.configuration;

import com.example.restaurantsystem.model.Restaurant;
import com.example.restaurantsystem.model.Speciality;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class BeanFactory {
    @Bean

    public List<Restaurant> getRestaurantList(){
        Restaurant restaurant = new Restaurant(1,"Shyam Sweets","Gurgaon","9876543210", Speciality.SMOSA);
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(restaurant);
        return restaurantList;
    }
}
