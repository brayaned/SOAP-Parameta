package com.parameta.wssoap.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "empleados")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "primer_nombre", nullable = false)
    private String primerNombre;
    private String segundoNombre;

    @Column(name = "primer_apellido", nullable = false)
    private String primerApellido;
    private String segundoApellido;


    @Column(name = "tipo_documento", nullable = false)
    private String tipoDocumento;
    @Column(name = "documento", nullable = false)
    private String documento;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;
    @Column(name = "cargo", nullable = false)
    private String cargo;
    @Column(name = "salario", nullable = false)
    private double salario;
    // getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}