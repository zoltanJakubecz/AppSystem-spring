package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppSystem;
import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.MenuItem;
import com.jakuza.servicesapp.repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuItemRepository repository;
    private final SystemService systemService;

    public void addNewMenu(AppSystem system, AppUser user, String name){
        MenuItem menuItem = MenuItem.builder()
                .name(name)
                .owner(user)
                .build();
        menuItem = repository.save(menuItem);

        system.addMenuItem(menuItem);
        systemService.update(system);
    }
}
