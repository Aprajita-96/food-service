package com.stackroute.foodieservice.config;

import com.stackroute.foodieservice.domain.Restaurant;
import com.stackroute.foodieservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImplementation implements ApplicationListener {
    @Value("${Rid}")
    int id;
    @Value("${Rname}")
    String name;
    @Value("${imageUrl}")
    String image;
    @Value("${Raddress}")
    String address;
    private UserRepository userRepository;


    @Autowired
    public ApplicationRunnerImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Application is running");
        userRepository.save(new Restaurant(id,name,image,address));
    }
}
