package com.stackroute.foodieservice.controller;

import com.stackroute.foodieservice.domain.Restaurant;
import com.stackroute.foodieservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestaurantController {
    private RestaurantService restaurantService;
    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("restaurant")
    public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant){
        Restaurant result=restaurantService.save(restaurant);
        return new ResponseEntity<Restaurant>(result,HttpStatus.OK);

    }
    @DeleteMapping("restaurants")
    public void delete(@RequestBody Restaurant restaurant){
        restaurantService.delete(restaurant);
    }
    @GetMapping("restaurants")
    public List<Restaurant> getAll(){
        List<Restaurant> list=restaurantService.getAllRestaurant();
        return list;
    }
    @GetMapping("restaurant/{id}")
    public ResponseEntity<Restaurant> getById(@PathVariable("id") int id){
        Restaurant restaurant=restaurantService.getById(id);
        return new ResponseEntity<Restaurant>(restaurant,HttpStatus.OK);
    }
    @PutMapping("restaurant/{id}")
    public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant,@PathVariable("id") int id){
        Restaurant restaurant1=restaurantService.updateRestaurant(restaurant,id);
        return new ResponseEntity<Restaurant>(restaurant1,HttpStatus.OK);
    }
}
