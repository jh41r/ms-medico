package com.example.msmedico.service;

import com.example.msmedico.domain.Medico;
import com.example.msmedico.domain.Turno;

import java.util.List;

public interface TurnoService {
    Turno create(Turno m);
    Turno update(Turno m);
    void delete(Turno id);
    Turno read(Long id);
    List<Turno> readAll();
}
