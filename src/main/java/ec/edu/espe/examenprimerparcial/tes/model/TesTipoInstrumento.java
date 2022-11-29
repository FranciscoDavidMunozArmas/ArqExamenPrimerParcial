package ec.edu.espe.examenprimerparcial.tes.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TES_CATEGORIA_INSTRUMENTO")
@Data
@NoArgsConstructor
public class TesTipoInstrumento {

    @EmbeddedId
    private TesTipoInstrumentoPK pk;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private String tipoRenta;

    @Column(name = "COD_CLASE_INSTRUMENTO", length = 100, nullable = false)
    private String codClaseInstrumento;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private String codCategoriaInstrumento;

    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false, nullable = true),
            @JoinColumn(name = "COD_CATEGORIA_INSTRUMENTO", referencedColumnName = "COD_CATEGORIA_INSTRUMENTO", insertable = false, updatable = false, nullable = true)
    })
    private TesCategoriaInstrumento tesCategoriaInstrumento;

    public TesTipoInstrumento(TesTipoInstrumentoPK pk) {
        this.pk = pk;
    }

}
