package com.example.testmaryembaldi.Controller;

import com.example.testmaryembaldi.Entities.Composant;
import com.example.testmaryembaldi.Entities.Menu;
import com.example.testmaryembaldi.Services.ServiceMenu;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Menu")
public class MenuController {
    ServiceMenu menuService;


    @PostMapping("/ajouterComposants/{idMenu}")
    public Menu ajoutComposantsEtMiseAJourPrixTotalMenu(@RequestBody Set<Composant> composants, @PathVariable Long idMenu) {
        return menuService.ajoutComposantsEtMiseAJourPrixTotalMenu(composants, idMenu);
    }

}
