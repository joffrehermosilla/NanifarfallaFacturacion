package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaProvincia;


@Repository
public interface AuditoriaProvinciaRepository extends JpaRepository<AuditoriaProvincia, Integer> {

}
