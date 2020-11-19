package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.Icon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IconRepository extends JpaRepository<Icon, UUID> {
}
