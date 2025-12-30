package com.parameta.wssoap.mapper;

import com.parameta.wssoap.entity.EmpleadoEntity;
import org.springframework.stereotype.Component;
import  com.parameta.wssoap.generated.GuardarEmpleadoRequest;

@Component
public class EmpleadoMapper {

    public EmpleadoEntity toEntity(GuardarEmpleadoRequest request) {
        EmpleadoEntity entity = new EmpleadoEntity();
        entity.setPrimerNombre(request.getPrimerNombre());
        entity.setSegundoNombre(request.getSegundoNombre());
        entity.setPrimerApellido(request.getPrimerApellido());
        entity.setSegundoApellido(request.getSegundoApellido());
        entity.setTipoDocumento(request.getTipoDocumento());
        entity.setDocumento(request.getDocumento());
        entity.setFechaNacimiento(DateMapper.toLocalDate(request.getFechaNacimiento()));
        entity.setFechaIngreso(DateMapper.toLocalDate(request.getFechaIngreso()));
        entity.setCargo(request.getCargo());
        entity.setSalario(request.getSalario());
        return entity;
    }
}