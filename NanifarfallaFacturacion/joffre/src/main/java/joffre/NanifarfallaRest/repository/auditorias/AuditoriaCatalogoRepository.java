package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaCatalogo;


@Repository
public interface AuditoriaCatalogoRepository extends JpaRepository<AuditoriaCatalogo, Integer> {

}
