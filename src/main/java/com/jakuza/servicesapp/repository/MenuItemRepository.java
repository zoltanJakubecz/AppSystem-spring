package com.jakuza.servicesapp.repository;

import com.jakuza.servicesapp.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuItemRepository extends JpaRepository<MenuItem, UUID> {
}
