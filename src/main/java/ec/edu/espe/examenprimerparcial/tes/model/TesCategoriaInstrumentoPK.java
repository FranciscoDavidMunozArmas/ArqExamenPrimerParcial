package ec.edu.espe.examenprimerparcial.tes.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class TesCategoriaInstrumentoPK implements Serializable {
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codempresa;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private Integer codcategoriainstrumento;
}
