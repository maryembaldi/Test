package com.example.testmaryembaldi.Repositories;

import com.example.testmaryembaldi.Entities.Client;
import com.example.testmaryembaldi.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
