package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoProducto;

@Repository
public interface AuditoriaTipoProductoRepository extends JpaRepository<AuditoriaTipoProducto, Integer> {

}
