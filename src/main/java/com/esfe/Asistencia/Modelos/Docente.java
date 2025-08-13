package com.esfe.Asistencia.Modelos;

import java.util.*;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "docente")
public class Docente {
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer Id;

      @NotBlank(message = "El nombre es requerido")
      private String nombre;

      @NotBlank(message = "El apellido es requerido")
      private String apellido;

      @NotBlank(message = "El email es requerido")
      @Email(message = "La entrada no corresponde a un email")
      private String email;

      @NotBlank(message = "El telefono es requerido")
      private String telefono;

      @NotBlank(message = "El nombre de la escuela es requerido")
      private String escuela;

      public Integer getId() {
          return Id;
      }
      public void setId(Integer id) {
          Id = id;
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

      public String getTelefono() {
          return telefono;
      }
      public void setTelefono(String telefono) {
          this.telefono = telefono;
      }

      public String getEscuela() {
          return escuela;
      }
      public void setEscuela(String escuela) {
          this.escuela = escuela;
      }

      @ManyToMany
      @JoinTable(
        name = "docentes_grupos",
        joinColumns = @JoinColumn(name = "docente_id"),
        inverseJoinColumns = @JoinColumn(name = "grupo_id")
        )
        private Set<Grupo> grupos = new HashSet<>();
}
