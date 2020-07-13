package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaCiudad;


@Repository
public interface AuditoriaCiudadRepository extends JpaRepository<AuditoriaCiudad, Integer> {

}
