package com.ttrc.userservice.entity;



import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="FirstName")
    private String FirstName;

    @Column(name="LastName")
    private String LastName;

    @Column(name="UserId")
    private String UserId;

    @Column(name="UserEmail")
    private String UserEmail;

    @Column(name="Password")
    private String Password;

    @Column(name="Notes")
    private String Notes;

    @Column(name="IsActive")
    private Integer IsActive;

    @Column(name="isAdmin")
    private Integer IsAdmin;

}


