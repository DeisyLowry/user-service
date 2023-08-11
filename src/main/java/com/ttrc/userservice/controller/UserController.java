package com.ttrc.userservice.controller;

import com.ttrc.userservice.dto.UserDto;
import com.ttrc.userservice.dto.UserRequestDto;
import com.ttrc.userservice.entity.User;
import com.ttrc.userservice.service.UserService;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ttrc.userservice.mapper.UserMapper.mapToUserDto;


@RestController
@AllArgsConstructor
@RequestMapping("api/v1/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "Hello Test Inside";
    }


    // @GetMapping
    // {id} - URI Template
    //
    // http://localhost:8080/api/v1/users/1
/*
    @GetMapping("/id")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") String userId){

        UserDto returnUserDto = userService.getUserById(userId);
        return new ResponseEntity<>(returnUserDto, HttpStatus.OK);
    }

*/
    // @GetMapping
    // public String getAllUsers(){ return "Sending back all users";}
    // Build Get All Users REST API
    // http://localhost:8080/api/v1/users


   /* @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    */

    // Build Get All Users REST API
    // http://localhost:3000/api/users
    /*@GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
*/
    // Build Get one User by Id REST API
    // http://localhost:8080/api/v1/users/1
    @GetMapping("{id}")
    public ResponseEntity<UserDto>  getUserByOneId(@PathVariable("id") Integer id)
    {
        User user = userService.getUserById(id);
        UserDto userDto = mapToUserDto(user);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/v1/users
    @GetMapping
    public  ResponseEntity<List<User>> getAllUsers(){
        List<User> retUsers = userService.getAllUsers();
        return new ResponseEntity<>(retUsers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto newUserDto)
    {
        UserDto retUser = userService.createUser(newUserDto);
        return new ResponseEntity<>(retUser, HttpStatus.OK);
    }
    // Build Get one User by Id REST API
    // http://localhost:8080/api/v1/users/1
    @DeleteMapping("{id}")
    public ResponseEntity<Integer>  deleteUser(@PathVariable("id") Integer id)
    {
        userService.deleteUser(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping
    public String updatedUser()
    { return "Updating users";
    }

    @PatchMapping
    public String patchingUsers()
    { return "Patching users";
    }



}
