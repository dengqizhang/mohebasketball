package org.example.controller;

import org.example.model.VipUserDto;
import org.example.service.VipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class VipUserController {

    @Autowired private VipUserService vipUserService;
    @GetMapping("/getVipUser")
    public List<VipUserDto> findAllVipUser(){
        return vipUserService.findAllList();
    }
}
