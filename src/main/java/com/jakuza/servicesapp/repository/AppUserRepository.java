package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
