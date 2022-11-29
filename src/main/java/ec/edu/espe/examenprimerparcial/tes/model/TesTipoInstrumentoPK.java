package ec.edu.espe.examenprimerparcial.tes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class TesTipoInstrumentoPK {

    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codempresa;

    @Column(name = "COD_TIPO_INSTRUMENTO", length = 15, nullable = false)
    private String codtipoinstrumento;
}
