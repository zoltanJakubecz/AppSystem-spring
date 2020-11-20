package com.jakuza.servicesapp.controller;

import com.jakuza.servicesapp.model.dto.AppSystemDto;
import com.jakuza.servicesapp.service.SystemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@RequiredArgsConstructor
public class AppSystemController {

    private final SystemService service;

    @PostMapping
    public ResponseEntity<AppSystemDto> addNewSystem(@RequestBody AppSystemDto appSystemDto){
        return ResponseEntity.ok().body(service.create(appSystemDto));
    }

}
