package com.example.restaurantsystem.repositry;

import com.example.restaurantsystem.configuration.BeanFactory;
import com.example.restaurantsystem.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RestaurantRepositry {

    @Autowired
    BeanFactory restaurantBean;

    public List<Restaurant> getAllRestaurant() {
        return restaurantBean.getRestaurantList();
    }
}
