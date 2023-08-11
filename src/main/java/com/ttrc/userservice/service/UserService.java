package com.ttrc.userservice.service;

import com.ttrc.userservice.dto.UserDto;
import com.ttrc.userservice.dto.UserRequestDto;
import com.ttrc.userservice.dto.UserResponseDto;
import com.ttrc.userservice.entity.User;
import com.ttrc.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

/*
    UserDto saveUser(UserDto userDto);
    UserDto createUser(UserDto userDto);
    UserDto getUserById(String userId);

    //UserDto createUser(User user);

    //List<UserDto> getAllUsers();


    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);

 */
List<User> getAllUsers();
User getUserById(Integer id);

UserDto createUser(UserDto userRequestDto);

void deleteUser(Integer userId);

}
