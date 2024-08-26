package com.syedrizwan.AuthAdmin.Dto;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // e.g., "Super Admin", "Admin"
    
    @ManyToMany(mappedBy = "roles")
    private Set<Permissios> permissions;

}
