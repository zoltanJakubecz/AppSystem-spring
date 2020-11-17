package com.jakuza.servicesapp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppUser {

    @Id
    @GeneratedValue
    private UUID id;

    private String fullName;

    @ManyToMany
    @Singular
    private List<AppSystem> appSystems;
}
