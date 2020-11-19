package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppSystem;
import com.jakuza.servicesapp.repository.AppSystemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class SystemService {

    private final AppSystemRepository repository;

    @Transactional
    public void update(AppSystem system){
        AppSystem appSystem = repository.findById(system.getId()).orElse(null);
        if(appSystem == null) return;
        appSystem.setMainMenu(system.getMainMenu());
    }
}
