package com.jakuza.servicesapp.model.dto;

import com.jakuza.servicesapp.model.Application;
import com.jakuza.servicesapp.model.Icon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IconDto {

    private UUID id;

    private String name;

    private Application application;

    public static IconDto fromEntity(Icon icon){
        return IconDto.builder()
                .name(icon.getName())
                .id(icon.getId())
                .application(icon.getApplication())
                .build();
    }
}
