package ec.edu.espe.examenprimerparcial.tes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesTipoInstrumentoPK;

public interface TesTipoInstrumentoRepository extends JpaRepository<TesTipoInstrumento, TesTipoInstrumentoPK> {
    List<TesTipoInstrumento> findByPkCodempresa(Integer codEmpresa);

    List<TesTipoInstrumento> findByPkCodtipoinstrumento(String codTipoInstrumento);
}
