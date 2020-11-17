package com.jakuza.servicesapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MenuItem {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany
    private List<MenuItem> submenus;

    @ManyToMany
    @Singular
    private List<AppUser> owners;
}
