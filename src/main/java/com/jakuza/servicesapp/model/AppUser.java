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
public class AppUser {

    @Id
    @GeneratedValue
    private UUID id;

    private String fullName;

    @ManyToMany(cascade = { CascadeType.ALL })
    private List<AppSystem> mySystems;

}
