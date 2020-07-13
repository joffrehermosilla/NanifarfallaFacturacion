package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoInsumo;

@Repository
public interface AuditoriaTipoInsumoRepository extends JpaRepository<AuditoriaTipoInsumo, Integer> {

}
