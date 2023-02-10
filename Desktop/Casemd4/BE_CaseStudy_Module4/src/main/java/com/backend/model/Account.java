package com.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private String adress;
    private String phoneNumber;
    @OneToOne()
    private Image avatar;
    private Role role;
}
