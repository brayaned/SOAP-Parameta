package com.parameta.wssoap.repository;

import com.parameta.wssoap.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository
        extends JpaRepository<EmpleadoEntity, Long> {
}