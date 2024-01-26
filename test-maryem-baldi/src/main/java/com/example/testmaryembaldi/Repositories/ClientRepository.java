package com.example.testmaryembaldi.Repositories;

import com.example.testmaryembaldi.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
