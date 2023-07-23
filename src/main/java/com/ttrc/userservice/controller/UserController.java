package com.ttrc.userservice.controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    @GetMapping("/test")
    public String test(){
        return "Hello Test Inside";
    }


    @GetMapping
    public String getAllUsers(){ return "Sending back all users";}

    @PostMapping
    public String createUser()
    {
        return "Creating users";
    }
    @DeleteMapping
    public String deleteUser()
    { return "Deleting users";
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
