package com.example.testmaryembaldi.Controller;


import com.example.testmaryembaldi.Entities.Client;
import com.example.testmaryembaldi.Services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")

public class ClientController {

    ClientService clientService;
    @PostMapping("ajouterClient")
    public ResponseEntity<Client> ajouterClient(@RequestBody Client cl){
        Client clientAjouter = clientService.ajouterClient(cl);
        return new ResponseEntity<Client>(clientAjouter, HttpStatus.CREATED);
    }

}
