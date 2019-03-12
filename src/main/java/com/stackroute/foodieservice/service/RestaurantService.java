package com.stackroute.foodieservice.service;

import com.stackroute.foodieservice.domain.Restaurant;
import com.stackroute.foodieservice.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    private UserRepository userRepository;
    @Autowired
    public RestaurantService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Restaurant save(Restaurant restaurant){
        Restaurant resultant=userRepository.save(restaurant);
        return resultant;
    }
    public void delete(Restaurant restaurant){
        userRepository.delete(restaurant);
    }
    public List<Restaurant> getAllRestaurant(){
        List<Restaurant> resultant=(List<Restaurant>)userRepository.findAll();
        return resultant;
    }
    public Restaurant getById(int id){
        Optional<Restaurant> result=userRepository.findById(id);
         return result.get();
    }
    public Restaurant updateRestaurant(Restaurant restaurant,int id){
        Optional<Restaurant> result=userRepository.findById(id);
        Restaurant fetchedRestaurant=result.get();
        fetchedRestaurant.setImageUrl(restaurant.getImageUrl());
        fetchedRestaurant.setResAddress(restaurant.getResAddress());
        fetchedRestaurant.setRestaurantName(restaurant.getRestaurantName());
        return userRepository.save(fetchedRestaurant);
    }
}
