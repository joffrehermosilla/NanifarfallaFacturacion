package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaProducto;

@Repository
public interface AuditoriaProductoRepository extends JpaRepository<AuditoriaProducto, Integer> {

}
