package ec.edu.espe.examenprimerparcial.tes.service;

import java.util.List;

import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumentoPK;

public interface TesCategoriaInstrumentoService {
    List<TesCategoriaInstrumento> findAll();

    List<TesCategoriaInstrumento> findAllRent(Integer rentValue);

    TesCategoriaInstrumento findByCodEmpresa(Integer codEmpresa);

    TesCategoriaInstrumento findByCodCategoriaInstrumento(Integer codCategoriaInstrumento);

    TesCategoriaInstrumento create(TesCategoriaInstrumento tesCategoriaInstrumento);

    TesCategoriaInstrumento update(TesCategoriaInstrumento tesCategoriaInstrumento,
            TesCategoriaInstrumentoPK tesCategoriaInstrumentoPK);

    void delete(TesCategoriaInstrumentoPK tesCategoriaInstrumentoPK);
}
