package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaLoteInsumo;
@Repository
public interface AuditoriaLoteInsumoRepository  extends JpaRepository<AuditoriaLoteInsumo, Integer>{

}
