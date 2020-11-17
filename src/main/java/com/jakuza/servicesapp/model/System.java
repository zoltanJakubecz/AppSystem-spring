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
public class System {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToMany
    private List<AppUser> appUserList;

    @OneToMany
    private List<Application> applicationList;

    @ManyToMany
    private List<MenuItem> mainMenu;


}
