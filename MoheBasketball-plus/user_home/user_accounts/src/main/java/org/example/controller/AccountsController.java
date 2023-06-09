package org.example.controller;

import org.example.model.AccountsDto;
import org.example.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {
    @Autowired
    AccountsService accountsService;
    @GetMapping("/accounts/{id}")
    public AccountsDto finAllaccounts(@PathVariable("id") int id){
        return accountsService.findByIdaccounts(id);
    }
}
