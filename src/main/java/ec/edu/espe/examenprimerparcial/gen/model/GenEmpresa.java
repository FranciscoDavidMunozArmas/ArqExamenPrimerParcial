package ec.edu.espe.examenprimerparcial.gen.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "GEN_EMPRESA")
@Data
@NoArgsConstructor
public class GenEmpresa {

    @Id
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codEmpresa;

    @Column(name = "NOMBRE", length = 150, nullable = false)
    private String nombre;

    @Column(name = "COD_LOGOTIPO_EMPRESA", scale = 8, precision = 0, nullable = false)
    private BigDecimal codLogotipoEmpresa;

    @Column(name = "COD_LOGOTIPO_REPORTE", scale = 8, precision = 0, nullable = false)
    private BigDecimal codLogitipoEmpresa;

    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;

    public GenEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

}
