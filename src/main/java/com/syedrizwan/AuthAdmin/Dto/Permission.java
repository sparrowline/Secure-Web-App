package com.syedrizwan.AuthAdmin.Dto;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Permission {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g., "VIEW_USERS", "EDIT_USERS", "DELETE_USERS"

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles;

}
