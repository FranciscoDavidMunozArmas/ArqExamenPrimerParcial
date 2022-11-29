package ec.edu.espe.examenprimerparcial.gen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenprimerparcial.gen.model.GenEmpresa;
import ec.edu.espe.examenprimerparcial.gen.service.GenEmpresaService;

@RestController
@RequestMapping("/gen/empresa")
public class GenEmpresaController {

    @Autowired
    private GenEmpresaService service;

    @GetMapping
    public List<GenEmpresa> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{name}")
    public List<GenEmpresa> findByName(@PathVariable("name") String name) {
        return this.service.findByName(name);
    }

    @PostMapping
    public GenEmpresa create(@RequestBody GenEmpresa genEmpresa) {
        return this.service.create(genEmpresa);
    }
}
