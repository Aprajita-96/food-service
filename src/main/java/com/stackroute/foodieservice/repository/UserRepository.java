package com.stackroute.foodieservice.repository;

import com.mongodb.Mongo;
import com.stackroute.foodieservice.domain.Restaurant;


import org.springframework.data.jpa.repository.Query;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Restaurant,Integer> {

    @Query(value = "SELECT r FROM Restaurant r WHERE r.restaurantName=?1")
    Restaurant findByName(String name);
}
