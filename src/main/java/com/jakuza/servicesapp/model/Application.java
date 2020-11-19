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
public class Application {

    @Id
    private UUID id;

    private String name;

    @OneToMany
    @Singular
    private List<AppUser> users;

    @OneToOne(cascade = CascadeType.ALL)
    private Icon icon;

    public void runApplication(){
        System.out.println(name + " is running...");
    }

}
