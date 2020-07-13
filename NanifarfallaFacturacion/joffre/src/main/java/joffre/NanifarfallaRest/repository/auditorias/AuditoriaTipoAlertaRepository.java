package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoAlerta;

@Repository
public interface AuditoriaTipoAlertaRepository extends JpaRepository<AuditoriaTipoAlerta, Integer> {

}
