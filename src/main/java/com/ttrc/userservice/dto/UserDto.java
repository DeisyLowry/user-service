package com.ttrc.userservice.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    //private Integer id;
    private String FirstName;
    private String LastName;
    private String UserId;
    private String UserEmail;
    private String Password;
    private String Notes;
    private Integer IsActive;
    private Integer IsAdmin;

}
