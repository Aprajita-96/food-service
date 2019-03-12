package com.stackroute.foodieservice.repository;

import com.stackroute.foodieservice.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Restaurant,Integer> {
}
