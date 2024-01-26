package com.example.testmaryembaldi.Services;

import com.example.testmaryembaldi.Entities.Client;
import com.example.testmaryembaldi.Repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Primary
public class ClientService implements IClient {

    ClientRepository clientRepository;
    @Override
    public Client ajouterClient(Client cl) {
        return clientRepository.save(cl);
    }

    public void affecterClientAuMenu(String identifiant, String libelleMenu) {

    

    }
}
