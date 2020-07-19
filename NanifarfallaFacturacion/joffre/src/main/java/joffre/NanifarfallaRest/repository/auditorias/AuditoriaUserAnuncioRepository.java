package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaUserAnuncio;

@Repository
public interface AuditoriaUserAnuncioRepository extends JpaRepository<AuditoriaUserAnuncio, Integer> {

}
