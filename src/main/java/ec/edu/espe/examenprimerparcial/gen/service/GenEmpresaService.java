package ec.edu.espe.examenprimerparcial.gen.service;

import java.util.List;

import ec.edu.espe.examenprimerparcial.gen.model.GenEmpresa;

public interface GenEmpresaService {
    List<GenEmpresa> findAll();

    GenEmpresa findByCode(Integer codEmpresa);

    List<GenEmpresa> findByName(String name);

    GenEmpresa create(GenEmpresa genEmpresa);

    GenEmpresa update(GenEmpresa genEmpresa, Integer codEmpresa);

    void delete(Integer codEmpresa);
}
