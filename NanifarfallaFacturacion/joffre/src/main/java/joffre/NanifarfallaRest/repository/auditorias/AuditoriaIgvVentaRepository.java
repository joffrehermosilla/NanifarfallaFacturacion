package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaIgvVenta;

@Repository
public interface AuditoriaIgvVentaRepository extends JpaRepository<AuditoriaIgvVenta, Integer> {

}
