package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoProducto;
@Repository
public interface AuditoriaEstadoProductoRepository extends JpaRepository<AuditoriaEstadoProducto, Integer> {

}
