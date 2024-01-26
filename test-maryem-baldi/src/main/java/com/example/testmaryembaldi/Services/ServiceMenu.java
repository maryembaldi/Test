package com.example.testmaryembaldi.Services;


import com.example.testmaryembaldi.Entities.Composant;
import com.example.testmaryembaldi.Entities.Menu;
import com.example.testmaryembaldi.Repositories.MenuRepository;
import com.example.testmaryembaldi.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
@Primary
public class ServiceMenu implements IMenu {
    MenuRepository menuRepository;

    @Override
    public Menu ajoutComposantsEtMiseAJourPrixTotalMenu(Set<Composant> composants, Long idMenu) {
        Menu menu = menuRepository.findById(idMenu).orElseThrow(() -> new RuntimeException("Menu non trouvé"));
        menu.getComposants().addAll(composants);

        return menuRepository.save(menu);
    }

    @Override
    public void affecterClientAuMenu(String identifiant, String libelleMenu) {

    }

}
