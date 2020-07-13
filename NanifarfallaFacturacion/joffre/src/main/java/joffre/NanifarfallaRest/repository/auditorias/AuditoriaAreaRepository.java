package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaArea;

@Repository
public interface AuditoriaAreaRepository extends JpaRepository<AuditoriaArea, Integer> {

}
