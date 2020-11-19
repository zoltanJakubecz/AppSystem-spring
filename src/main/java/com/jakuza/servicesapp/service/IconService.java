package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.Icon;
import com.jakuza.servicesapp.model.dto.IconDto;
import com.jakuza.servicesapp.repository.IconRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IconService {

    private IconRepository iconRepository;

    public IconDto create(IconDto iconDto){
        return IconDto.fromEntity(iconRepository.save(Icon.builder()
                .name(iconDto.getName())
                .application(iconDto.getApplication())
                .build()));
    }
}
