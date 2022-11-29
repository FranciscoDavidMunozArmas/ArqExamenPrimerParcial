package ec.edu.espe.examenprimerparcial.tes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumento;
import ec.edu.espe.examenprimerparcial.tes.service.TesCategoriaInstrumentoService;

@RestController
@RequestMapping("tes/categoria")
public class TesCategoriaInstrumentoController {
    @Autowired
    private TesCategoriaInstrumentoService service;

    @GetMapping
    public List<TesCategoriaInstrumento> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{rent}")
    public List<TesCategoriaInstrumento> findByRent(@PathVariable("rent") Integer rent) {
        return this.service.findAllRent(rent);
    }
}
