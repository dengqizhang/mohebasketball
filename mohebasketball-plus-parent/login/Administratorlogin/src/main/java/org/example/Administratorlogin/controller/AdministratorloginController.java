package org.example.Administratorlogin.controller;

import org.example.Administratorlogin.mapper.AdministratorloginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@CrossOrigin
public class AdministratorloginController {
    @Autowired
    private AdministratorloginMapper administratorloginMapper;
    @GetMapping(value = "/login")
    public String login(){

        return "demo";

    }
}
