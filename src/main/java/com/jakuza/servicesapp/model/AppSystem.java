package com.jakuza.servicesapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppSystem {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToMany
    private List<AppUser> appUserList;

    @OneToMany
    private List<Application> applicationList;




}
