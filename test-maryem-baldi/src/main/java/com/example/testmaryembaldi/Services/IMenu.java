package com.example.testmaryembaldi.Services;

import com.example.testmaryembaldi.Entities.Composant;
import com.example.testmaryembaldi.Entities.Menu;

import java.util.Set;

public interface IMenu {

    Menu ajoutComposantsEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu);
    void affecterClientAuMenu (String identifiant, String libelleMenu);
}
