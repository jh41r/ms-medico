package com.example.msmedico.repository;
import com.example.msmedico.domain.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
    Turno readById(Long id);
}
