package com.parameta.wssoap.endpoint;

import com.parameta.wssoap.service.EmpleadoService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class EmpleadoEndpoint {

    private static final String NAMESPACE =
            "http://parameta.com/empleado";

    private final EmpleadoService empleadoService;

    public EmpleadoEndpoint(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PayloadRoot(
            localPart = "guardarEmpleadoRequest"
    )
    @ResponsePayload
    public com.parameta.wssoap.generated.GuardarEmpleadoResponse guardarEmpleado(
            @RequestPayload com.parameta.wssoap.generated.GuardarEmpleadoRequest request) {

        empleadoService.guardarEmpleado(request);

        com.parameta.wssoap.generated.GuardarEmpleadoResponse response =
                new com.parameta.wssoap.generated.GuardarEmpleadoResponse();
        response.setMensaje("Empleado guardado correctamente");
        response.setCodigo(BigInteger.valueOf(200));
        return response;
    }
}