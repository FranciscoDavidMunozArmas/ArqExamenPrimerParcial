package ec.edu.espe.examenprimerparcial.tes.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumentoPK;
import ec.edu.espe.examenprimerparcial.tes.repository.TesCategoriaInstrumentoRepository;
import ec.edu.espe.examenprimerparcial.tes.repository.TesTipoInstrumentoRepository;

@Service
public class TesCategoriaInstrumentoServiceImpl implements TesCategoriaInstrumentoService {

    @Autowired
    private TesCategoriaInstrumentoRepository repository;

    @Override
    public List<TesCategoriaInstrumento> findAll() {
        return this.repository.findAll();
    }

    @Override
    public TesCategoriaInstrumento findByCodEmpresa(Integer codEmpresa) {
        return this.repository.findByPkCodempresa(codEmpresa).get(0);
    }

    @Override
    public TesCategoriaInstrumento findByCodCategoriaInstrumento(Integer codCategoriaInstrumento) {
        return this.repository.findByPkCodcategoriainstrumento(codCategoriaInstrumento).get(0);
    }

    @Override
    public TesCategoriaInstrumento create(TesCategoriaInstrumento tesCategoriaInstrumento) {
        return this.repository.save(tesCategoriaInstrumento);
    }

    @Override
    public TesCategoriaInstrumento update(TesCategoriaInstrumento tesCategoriaInstrumento,
            TesCategoriaInstrumentoPK tesCategoriaInstrumentoPK) {
        tesCategoriaInstrumento.setPk(tesCategoriaInstrumentoPK);
        return this.repository.save(tesCategoriaInstrumento);
    }

    @Override
    public void delete(TesCategoriaInstrumentoPK tesCategoriaInstrumentoPK) {
        TesCategoriaInstrumento data = this.repository.findById(tesCategoriaInstrumentoPK).get();
        this.repository.delete(data);
    }

    @Override
    public List<TesCategoriaInstrumento> findAllRent(Integer rentValue) {
        List<TesCategoriaInstrumento> categories = this.repository.findAll();

        List<TesCategoriaInstrumento> newCategories = new ArrayList<TesCategoriaInstrumento>();

        for (TesCategoriaInstrumento tesCategoriaInstrumento : categories) {
            if (tesCategoriaInstrumento.getTipoRenta() == rentValue) {
                newCategories.add(tesCategoriaInstrumento);
            }
        }

        return newCategories;
    }

}
