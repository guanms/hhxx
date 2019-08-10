package com.gms.user.controller;


import com.gms.user.entity.Users;
import com.gms.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public Users findById(@PathVariable Long id){
        Users users = new Users();
        users = usersService.findById(id);
        return users;
    }

}
