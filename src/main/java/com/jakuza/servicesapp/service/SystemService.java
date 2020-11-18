package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.MenuItem;
import com.jakuza.servicesapp.repository.AppSystemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SystemService {

    private final AppSystemRepository repository;

    public void addMenu(MenuItem item){

    }

}
