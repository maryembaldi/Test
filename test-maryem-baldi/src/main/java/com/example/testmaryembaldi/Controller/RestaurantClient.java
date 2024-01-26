package com.example.testmaryembaldi.Controller;


import com.example.testmaryembaldi.Services.ClientService;
import com.example.testmaryembaldi.Services.RestaurantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantClient {



    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/ajouter")
    public Restaurant ajouterRestaurantEtMenusAssocie(@RequestBody Restaurant restaurant) {
        return restaurantService.ajouterRestaurantEtMenusAssocie(restaurant);
    }
}
