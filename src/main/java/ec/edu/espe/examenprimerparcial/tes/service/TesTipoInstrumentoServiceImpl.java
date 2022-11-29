package ec.edu.espe.examenprimerparcial.tes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumentoPK;
import ec.edu.espe.examenprimerparcial.tes.repository.TesTipoInstrumentoRepository;

public class TesTipoInstrumentoServiceImpl implements TesTipoInstrumentoService {

    @Autowired
    private TesTipoInstrumentoRepository repository;

    @Override
    public List<TesTipoInstrumento> findAll() {
        return this.repository.findAll();
    }

    @Override
    public List<TesTipoInstrumento> findByCodEmpresa(Integer codEmpresa) {
        return this.repository.findByPkCodempresa(codEmpresa);
    }

    @Override
    public TesTipoInstrumento findByCodTipoInstrumento(String codTipoInstrumento) {
        return this.repository.findByPkCodtipoinstrumento(codTipoInstrumento).get(0);
    }

    @Override
    public TesTipoInstrumento create(TesTipoInstrumento tesTipoInstrumento) {
        return this.repository.save(tesTipoInstrumento);
    }

    @Override
    public TesTipoInstrumento update(TesTipoInstrumento tesTipoInstrumento, TesTipoInstrumentoPK tesTipoInstrumentoPK) {
        tesTipoInstrumento.setPk(tesTipoInstrumentoPK);
        return this.repository.save(tesTipoInstrumento);
    }

    @Override
    public void delete(TesTipoInstrumentoPK tesTipoInstrumentoPK) {
        TesTipoInstrumento data = this.repository.findById(tesTipoInstrumentoPK).get();
        this.repository.delete(data);
    }

}
