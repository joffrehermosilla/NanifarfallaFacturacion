package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaInsumo;


@Repository
public interface AuditoriaInsumoRepository extends JpaRepository<AuditoriaInsumo, Integer> {

}
