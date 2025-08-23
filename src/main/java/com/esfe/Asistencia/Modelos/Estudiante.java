package com.esfe.Asistencia.Modelos;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message =  "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "El apellido es requerido")
    private String apellido;

    @NotBlank(message = "El email es requerido")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany
    @JoinTable(
        name =  "estudiantes_grupos",
        joinColumns = @JoinColumn(name = "estudiante_id"),
        inverseJoinColumns = @JoinColumn(name = "grupo_id")
    )
    private Set<Grupo> grupos = new HashSet<>();

}
