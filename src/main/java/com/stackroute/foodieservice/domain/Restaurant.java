package com.stackroute.foodieservice.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
    @Id
    private int id;
    private String restaurantName;
    private String imageUrl;
    private String resAddress;

    public Restaurant() {
    }

    public Restaurant(int id, String restaurantName, String imageUrl, String resAddress) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.imageUrl = imageUrl;
        this.resAddress= resAddress;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", ResAddress='" + resAddress + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getResAddress() {
        return resAddress;
    }

    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }
}
