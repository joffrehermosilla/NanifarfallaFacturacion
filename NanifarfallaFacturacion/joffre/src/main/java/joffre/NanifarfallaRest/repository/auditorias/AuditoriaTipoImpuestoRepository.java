package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoImpuesto;


@Repository
public interface AuditoriaTipoImpuestoRepository extends JpaRepository<AuditoriaTipoImpuesto, Integer> {

}
