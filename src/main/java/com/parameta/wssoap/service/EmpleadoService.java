package com.parameta.wssoap.service;

import com.parameta.wssoap.entity.EmpleadoEntity;
import com.parameta.wssoap.mapper.EmpleadoMapper;
import com.parameta.wssoap.repository.EmpleadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    private final EmpleadoRepository repository;
    private final EmpleadoMapper mapper;

    public EmpleadoService(EmpleadoRepository repository,
                           EmpleadoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    public void guardarEmpleado(com.parameta.wssoap.generated.GuardarEmpleadoRequest request) {
        EmpleadoEntity entity = mapper.toEntity(request);
        repository.save(entity);
    }
}