package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoCatalogo;

@Repository
public interface AuditoriaEstadoCatalogoRepository extends JpaRepository<AuditoriaEstadoCatalogo, Integer> {

}
