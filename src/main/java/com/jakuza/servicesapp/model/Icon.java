package com.jakuza.servicesapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Icon {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToOne(mappedBy = "icon")
    private Application application;
}
