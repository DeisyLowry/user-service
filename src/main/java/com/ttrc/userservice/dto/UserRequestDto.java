package com.ttrc.userservice.dto;

import lombok.*;

//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor

@Builder

public class UserRequestDto {

    private String FirstName;
    private String LastName;
    private String UserId;
    private String UserEmail;
    private String Password;
    private String Notes;
    private Integer IsActive;
    private Integer IsAdmin;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Integer getIsActive() {
        return IsActive;
    }

    public void setIsActive(Integer isActive) {
        IsActive = isActive;
    }

    public Integer getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        IsAdmin = isAdmin;
    }
}
