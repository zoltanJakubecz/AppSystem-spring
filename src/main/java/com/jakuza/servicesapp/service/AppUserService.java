package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.dto.AppUserDto;
import com.jakuza.servicesapp.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository userRepository;

    public AppUserDto createAppUser(AppUserDto appUserDto){
        return AppUserDto.fromEntity(userRepository.save(AppUser.builder()
                .fullName(appUserDto.getFullName())
                .build()));
    }

}
