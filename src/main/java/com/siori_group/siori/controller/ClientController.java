package com.siori_group.siori.controller;

import com.siori_group.siori.entity.Client;
import com.siori_group.siori.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping(value = "/clients")
    public String showClients(Model model, Pageable pageable) {
        Page<Client> page;
        page = clientRepository.findAll(pageable);
        model.addAttribute("clientListPage", page);
        return "clientsCommonList";
    }
    
}
