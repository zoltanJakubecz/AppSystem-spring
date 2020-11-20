package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppSystem;
import com.jakuza.servicesapp.model.dto.AppSystemDto;
import com.jakuza.servicesapp.model.dto.AppSystemIncomeDto;
import com.jakuza.servicesapp.repository.AppSystemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class SystemService {

    private final AppSystemRepository repository;

    public AppSystemDto create(AppSystemDto systemDto){
        return AppSystemDto.fromEntity(repository.save(AppSystem.builder()
                                                    .applicationList(systemDto.getApplicationList())
                                                    .appUserList(systemDto.getAppUserList())
                                                    .build()));
    }

    @Transactional
    public void update(AppSystem system){
        AppSystem appSystem = repository.findById(system.getId()).orElse(null);
        if(appSystem == null) return;
        appSystem.setMainMenu(system.getMainMenu());
    }

    public AppSystemDto createFromBasicData(AppSystemIncomeDto incomeDto){
        AppSystem newSys = new AppSystem();
        newSys.addApplication(incomeDto.getApplication());
        newSys.addUserToSystem(incomeDto.getAppUser());
        return AppSystemDto.fromEntity(repository.save(newSys));
    }
}
