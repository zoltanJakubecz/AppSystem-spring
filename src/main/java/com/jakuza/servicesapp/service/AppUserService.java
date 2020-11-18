package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.dto.AppUserDto;
import com.jakuza.servicesapp.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository userRepository;

    public AppUserDto create(AppUserDto appUserDto){
        return AppUserDto.fromEntity(userRepository.save(AppUser.builder()
                .fullName(appUserDto.getFullName())
                .build()));
    }

    @Transactional
    public AppUserDto update(UUID id, AppUserDto user){
        AppUser toUpdate = userRepository.findById(id).orElse(null);
        if(toUpdate == null) return null;
        toUpdate.setFullName(user.getFullName());
        return AppUserDto.fromEntity(toUpdate);
    }

    public boolean remove(UUID id){
        AppUser toRemove = userRepository.findById(id).orElse(null);
        if(toRemove != null) {
            userRepository.delete(toRemove);
            return true;
        }
        return false;
    }

}
