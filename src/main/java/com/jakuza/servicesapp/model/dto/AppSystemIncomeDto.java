package com.jakuza.servicesapp.model.dto;

import com.jakuza.servicesapp.model.AppUser;
import com.jakuza.servicesapp.model.Application;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AppSystemIncomeDto {

    private AppUser appUser;

    private Application application;

}
