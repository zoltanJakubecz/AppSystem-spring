package com.jakuza.servicesapp.model.dto;

import com.jakuza.servicesapp.model.AppSystem;
import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.Application;
import com.jakuza.servicesapp.model.MenuItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppSystemDto {
    private UUID id;

    private List<AppUser> appUserList;

    private List<Application> applicationList;

    private List<MenuItem> mainMenu;

    public static AppSystemDto fromEntity(AppSystem system){
        return AppSystemDto.builder()
                .id(system.getId())
                .appUserList(system.getAppUserList())
                .applicationList(system.getApplicationList())
                .mainMenu(system.getMainMenu())
                .build();
    }

}
