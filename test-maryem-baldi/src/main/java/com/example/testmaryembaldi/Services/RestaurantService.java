package com.example.testmaryembaldi.Services;

import com.example.testmaryembaldi.Entities.Restaurant;
import com.example.testmaryembaldi.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Primary
public class RestaurantService implements IRestaurant{

   RestaurantRepository restaurantRepository;

    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
