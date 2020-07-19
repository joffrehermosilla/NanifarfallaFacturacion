package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaAnuncio;



@Repository
public interface AuditoriaAnuncioRepository extends JpaRepository<AuditoriaAnuncio, Integer> {

}
