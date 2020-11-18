package com.jakuza.servicesapp.controller;

import com.jakuza.servicesapp.model.dto.AppUserDto;
import com.jakuza.servicesapp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService service;

    @PostMapping("/")
    public ResponseEntity<AppUserDto> create(@RequestBody AppUserDto userDto){
        return ResponseEntity.ok().body(service.create(userDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppUserDto> update(@PathVariable("id") UUID id, @RequestBody AppUserDto userDto){
        return ResponseEntity.ok().body(service.update(id, userDto));
    }

    @DeleteMapping("/{id}")
    public boolean deleteMovie(@PathVariable("id") UUID id) {
        return service.remove(id);
    }


}
