package com.gms.movie.controller;

import com.gms.movie.client.UserFeignClient;
import com.gms.movie.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MovieController {
//  @Autowired
//  private RestTemplate restTemplate;

//  @GetMapping("/user/{id}")
//  public Users findById(@PathVariable Long id) {
//    return this.restTemplate.getForObject("http://localhost:8000/" + id, Users.class);
//  }

  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/user/{id}")
  public Users findBYId(@PathVariable("id") Long id){
    return this.userFeignClient.findById(id);
  }

}
