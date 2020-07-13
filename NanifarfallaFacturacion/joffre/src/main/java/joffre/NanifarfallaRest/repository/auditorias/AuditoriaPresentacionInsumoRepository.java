package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPresentacionInsumo;

@Repository
public interface AuditoriaPresentacionInsumoRepository extends JpaRepository<AuditoriaPresentacionInsumo, Integer> {

}
