package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
