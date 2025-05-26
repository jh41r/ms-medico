package com.example.msmedico.repository;

import com.example.msmedico.domain.Especialidad;
import com.example.msmedico.domain.Medico;
import com.example.msmedico.service.GenericService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {
    Especialidad readById(Long id);
}
