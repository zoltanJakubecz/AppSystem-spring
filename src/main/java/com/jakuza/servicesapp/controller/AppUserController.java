package com.jakuza.servicesapp.controller;

import com.jakuza.servicesapp.model.dto.AppUserDto;
import com.jakuza.servicesapp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService service;

    @PostMapping("/")
    public ResponseEntity<AppUserDto> create(@RequestBody AppUserDto userDto){
        return ResponseEntity.ok().body(service.createAppUser(userDto));
    }

}
