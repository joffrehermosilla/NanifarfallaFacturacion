package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoInsumo;
@Repository
public interface AuditoriaEstadoInsumoRepository extends JpaRepository<AuditoriaEstadoInsumo, Integer> {

}
