package com.jakuza.servicesapp.service;

import com.jakuza.servicesapp.model.Icon;
import com.jakuza.servicesapp.model.dto.IconDto;
import com.jakuza.servicesapp.repository.IconRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

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

    @Transactional
    public IconDto update(IconDto iconDto){
        Icon toUpdate = iconRepository.findById(iconDto.getId()).orElse(null);
        if(toUpdate == null) return null;
        toUpdate.setName(iconDto.getName());
        toUpdate.setApplication(iconDto.getApplication());
        return IconDto.fromEntity(toUpdate);
    }

    public boolean remove(UUID id){
        Icon toRemove = iconRepository.findById(id).orElse(null);
        if(toRemove != null) {
            iconRepository.delete(toRemove);
            return true;
        }
        return false;
    }
}
