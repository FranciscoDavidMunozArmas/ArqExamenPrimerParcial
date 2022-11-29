package ec.edu.espe.examenprimerparcial.tes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumento;
import ec.edu.espe.examenprimerparcial.tes.model.TesCategoriaInstrumentoPK;

@Repository
public interface TesCategoriaInstrumentoRepository
        extends JpaRepository<TesCategoriaInstrumento, TesCategoriaInstrumentoPK> {

    List<TesCategoriaInstrumento> findByPkCodempresa(Integer codEmpresa);

    List<TesCategoriaInstrumento> findByPkCodcategoriainstrumento(Integer codCategoriaInstrumento);
}
