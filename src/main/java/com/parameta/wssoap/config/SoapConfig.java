package com.parameta.wssoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext context) {

        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "empleados")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("EmpleadoPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("http://parameta.com/empleado");
        wsdl.setSchema(schema);
        return wsdl;
    }

    @Bean
    public XsdSchema empleadosSchema() {
        return new SimpleXsdSchema(
                new ClassPathResource("wsdl/empleado.xsd"));
    }
}