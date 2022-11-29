package ec.edu.espe.examenprimerparcial.tes.model;

import ec.edu.espe.examenprimerparcial.gen.model.GenEmpresa;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TES_CATEGORIA_INSTRUMENTO")
@Data
@NoArgsConstructor
public class TesCategoriaInstrumento {

    @EmbeddedId
    private TesCategoriaInstrumentoPK pk;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private Integer nombre;

    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private Integer tipoRenta;

    @ManyToOne
    @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false, nullable = true)
    private GenEmpresa genEmpresa;

    public TesCategoriaInstrumento(TesCategoriaInstrumentoPK pk) {
        this.pk = pk;
    }
}
