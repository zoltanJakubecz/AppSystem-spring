package com.jakuza.servicesapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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

    @ManyToMany(mappedBy = "mySystems")
    private List<AppUser> appUserList;

    @OneToMany
    private List<Application> applicationList;

    @ManyToMany
    private List<MenuItem> mainMenu;

    public void addUserToSystem(AppUser user){
        if(appUserList == null) appUserList = new ArrayList<>();
        appUserList.add(user);
    }

    public void addApplication(Application application){
        if(applicationList == null) applicationList = new ArrayList<>();
        applicationList.add(application);
    }

    public void addMenuItem(MenuItem menuItem){
        if(mainMenu == null) mainMenu = new ArrayList<>();
        this.mainMenu.add(menuItem);
    }

}
