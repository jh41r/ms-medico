package com.example.msmedico.service;

import com.example.msmedico.domain.Especialidad;
import com.example.msmedico.domain.Medico;

import java.util.List;

public interface EspecialidadService {
    Especialidad create(Especialidad e);
    Especialidad update(Especialidad e);
    void delete(Especialidad id);
    Especialidad read(Long id);
    List<Especialidad> readAll();

}
