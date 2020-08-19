package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaClienteTienePreferencia;


@Repository
public interface AuditoriaClienteTienePreferenciaRepository
		extends JpaRepository<AuditoriaClienteTienePreferencia, Integer> {

}
