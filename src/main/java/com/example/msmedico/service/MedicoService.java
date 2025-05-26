package com.example.msmedico.service;

import com.example.msmedico.domain.Medico;
import java.util.List;
import java.util.Optional;

public interface MedicoService {
    Medico create(Medico m);
    Medico update(Medico m);
    void delete(Medico id);
    Medico read(Long id);
    List<Medico> readAll();

}
