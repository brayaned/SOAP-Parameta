package com.parameta.wssoap.config;

import com.parameta.wssoap.endpoint.EmpleadoEndpoint;
import com.parameta.wssoap.service.EmpleadoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointConfig {

    @Bean
    public EmpleadoEndpoint empleadoEndpoint(EmpleadoService service) {
        return new EmpleadoEndpoint(service);
    }
}