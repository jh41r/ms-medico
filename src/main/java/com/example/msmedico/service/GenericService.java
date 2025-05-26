package com.example.msmedico.service;

import com.example.msmedico.domain.Medico;

import java.util.List;
import java.util.Optional;

public interface GenericService <T,ID>{

        T read(ID id);
        T create(T entidad);
        T update(ID id, T entidad);
        void delete(ID id);
        List<T> readAll();
}
