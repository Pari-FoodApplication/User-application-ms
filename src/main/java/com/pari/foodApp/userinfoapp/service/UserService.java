package com.pari.foodApp.userinfoapp.service;


import com.pari.foodApp.userinfoapp.dto.UserDto;
import com.pari.foodApp.userinfoapp.entity.User;
import com.pari.foodApp.userinfoapp.mapper.UserMapper;
import com.pari.foodApp.userinfoapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public ResponseEntity<UserDto> getUserById(Integer id){
        Optional<User> user = userRepo.findById(id);
        if(user.isPresent()){
            UserDto userDto = UserMapper.INSTANCE.mapUserToUserDto(user.get());
            return new ResponseEntity<>(userDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    public UserDto addUser(UserDto userDto){
        User addedUser = userRepo.save(UserMapper.INSTANCE.mapUserDtoToUser(userDto));
        return UserMapper.INSTANCE.mapUserToUserDto(addedUser);
    }
}
