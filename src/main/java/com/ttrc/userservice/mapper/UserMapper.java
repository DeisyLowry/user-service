package com.ttrc.userservice.mapper;

import com.ttrc.userservice.dto.UserDto;
import com.ttrc.userservice.entity.User;

public class UserMapper {

    // Convert User JPA Entity into UserDto
    public static UserDto mapToUserDto(User user){
        UserDto retUserDto = new UserDto().builder()
                .FirstName(user.getFirstName())
                .LastName(user.getLastName())
                .UserId(user.getUserId())
                .UserEmail(user.getUserEmail())
                .IsActive(user.getIsActive())
                .IsAdmin(user.getIsAdmin())
                .Notes(user.getNotes())
                .Password(user.getPassword())
                .build();

        return retUserDto;

    }

    // Convert UserDto into User JPA Entity
    public static User mapToUser(UserDto userDto){
        User user = User.builder()
                .FirstName(userDto.getFirstName())
                .LastName(userDto.getLastName())
                .UserId(userDto.getUserId())
                .UserEmail(userDto.getUserEmail())
                .IsActive(userDto.getIsActive())
                .IsAdmin(userDto.getIsAdmin())
                .Notes(userDto.getNotes())
                .Password(userDto.getPassword())
                .build();

        return user;
    }

}
