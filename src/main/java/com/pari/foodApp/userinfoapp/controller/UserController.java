package com.pari.foodApp.userinfoapp.controller;

import com.pari.foodApp.userinfoapp.dto.UserDto;
import com.pari.foodApp.userinfoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "user/id/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping(path = "user")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        UserDto addedUser = userService.addUser(userDto);
        return new ResponseEntity<>(addedUser, HttpStatus.OK);
    }
}
