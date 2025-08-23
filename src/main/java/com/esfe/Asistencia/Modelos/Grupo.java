package com.esfe.Asistencia.Modelos;

import jakarta.validation.constraints.*;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre es requerido")
    private String nombre;

    @NotBlank(message = "La descripcion es requerido")
    private String descripcion;

    @ManyToMany(mappedBy = "grupos")
    private Set<Docente> docentes = new HashSet<>();

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

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Docente> getDocentes() {
        return docentes;
    }
    public void setDocentes(Set<Docente> docentes) {
        this.docentes = docentes;
    }
}
