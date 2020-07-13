package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaLinea;

@Repository
public interface AuditoriaLineaRepository extends JpaRepository<AuditoriaLinea, Integer> {

}
