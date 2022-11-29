package ec.edu.espe.examenprimerparcial.gen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenprimerparcial.gen.model.GenEmpresa;
import ec.edu.espe.examenprimerparcial.gen.repository.GenEmpresaRepository;

@Service
public class GenEmpresaServiceImpl implements GenEmpresaService {

    @Autowired
    private GenEmpresaRepository repository;

    @Override
    public List<GenEmpresa> findAll() {
        return this.repository.findAll();
    }

    @Override
    public GenEmpresa findByCode(Integer codEmpresa) {
        return this.repository.findById(codEmpresa).get();
    }

    @Override
    public GenEmpresa create(GenEmpresa genEmpresa) {
        return this.repository.save(genEmpresa);
    }

    @Override
    public GenEmpresa update(GenEmpresa genEmpresa, Integer codEmpresa) {
        genEmpresa.setCodEmpresa(codEmpresa);
        return this.repository.save(genEmpresa);
    }

    @Override
    public void delete(Integer codEmpresa) {
        this.repository.deleteById(codEmpresa);
    }

    @Override
    public List<GenEmpresa> findByName(String name) {
        return this.repository.findByNombre(name);
    }

}
