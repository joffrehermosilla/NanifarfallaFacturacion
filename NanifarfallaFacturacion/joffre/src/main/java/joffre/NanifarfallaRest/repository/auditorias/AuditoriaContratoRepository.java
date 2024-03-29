package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaContrato;


@Repository
public interface AuditoriaContratoRepository extends JpaRepository<AuditoriaContrato, Integer> {

}
