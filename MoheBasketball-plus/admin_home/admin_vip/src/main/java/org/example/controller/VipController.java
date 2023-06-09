package org.example.controller;

import org.example.pojo.Vip;
import org.example.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/vip")
public class VipController {
    @Autowired
    VipService vipService;
    //查询全部会员
    @GetMapping("/getvip")
    public List<Vip> findAllVip(){
        return vipService.findallVipList();
    }
    //根据id删除会员
    @PostMapping("/getvip/{id}")
    public int deletevip(@PathVariable("id") int id){
        return vipService.deletevip(id);
    }
}
