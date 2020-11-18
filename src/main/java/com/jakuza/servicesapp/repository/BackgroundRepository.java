package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.Background;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BackgroundRepository extends JpaRepository<Background, UUID> {
}
