package com.pari.foodApp.userinfoapp.mapper;


import com.pari.foodApp.userinfoapp.dto.UserDto;
import com.pari.foodApp.userinfoapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE =  Mappers.getMapper(UserMapper.class);
    User mapUserDtoToUser(UserDto userDto);
    UserDto mapUserToUserDto(User user);

}
