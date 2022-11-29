package ec.edu.espe.examenprimerparcial.gen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examenprimerparcial.gen.model.GenEmpresa;

@Repository
public interface GenEmpresaRepository extends JpaRepository<GenEmpresa, Integer> {

}
