package ec.edu.espe.examenprimerparcial.tes.service;

import java.util.List;

import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumentoPK;

public interface TesTipoInstrumentoService {
    List<TesTipoInstrumento> findAll();

    List<TesTipoInstrumento> findByCodEmpresa(Integer codEmpresa);

    TesTipoInstrumento findByCodTipoInstrumento(String codTipoInstrumento);

    TesTipoInstrumento create(TesTipoInstrumento tesTipoInstrumento);

    TesTipoInstrumento update(TesTipoInstrumento tesTipoInstrumento, TesTipoInstrumentoPK tesTipoInstrumentoPK);

    void delete(TesTipoInstrumentoPK tesTipoInstrumentoPK);
}
