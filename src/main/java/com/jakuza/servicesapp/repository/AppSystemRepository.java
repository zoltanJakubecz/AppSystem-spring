package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.System;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppSystemRepository extends JpaRepository<System, UUID> {
}
