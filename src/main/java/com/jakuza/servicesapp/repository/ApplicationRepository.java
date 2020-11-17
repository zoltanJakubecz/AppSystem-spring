package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplicationRepository extends JpaRepository<Application, UUID> {
}
