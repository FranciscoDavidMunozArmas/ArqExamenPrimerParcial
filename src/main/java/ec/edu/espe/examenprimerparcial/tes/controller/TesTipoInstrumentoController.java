package ec.edu.espe.examenprimerparcial.tes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumento;
import ec.edu.espe.examenprimerparcial.tes.service.TesTipoInstrumentoService;

@RestController
@RequestMapping("/tes/tipo")
public class TesTipoInstrumentoController {
    @Autowired
    private TesTipoInstrumentoService service;

    @GetMapping("/{enterprise}")
    public List<TesTipoInstrumento> findByEnterprise(@PathVariable("enterprise") Integer code) {
        return this.service.findByCodEmpresa(code);
    }

    @GetMapping
    public List<TesTipoInstrumento> findAll() {
        return this.service.findAll();
    }
}
