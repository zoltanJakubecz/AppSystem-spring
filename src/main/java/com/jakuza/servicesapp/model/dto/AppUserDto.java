package com.jakuza.servicesapp.model.dto;

import com.jakuza.servicesapp.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppUserDto {

    private UUID id;

    private String fullName;

    public static AppUserDto fromEntity(AppUser appUser){
        return AppUserDto.builder()
                .id(appUser.getId())
                .fullName(appUser.getFullName())
                .build();
    }

}
