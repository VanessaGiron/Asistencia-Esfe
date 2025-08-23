package com.esfe.Asistencia.Servicios.Interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.esfe.Asistencia.Modelos.Estudiante;

public interface IEstudianteService {
    Page<Estudiante> buscarTodosPaginados(Pageable pageable);

    List<Estudiante> buscarTodos();

    List<Estudiante> obtenerTodos();

    Optional<Estudiante> buscarPorId(Integer id);

    Estudiante crearOEditar(Estudiante estudiante);

    void eliminarPorId(Integer id);

}
