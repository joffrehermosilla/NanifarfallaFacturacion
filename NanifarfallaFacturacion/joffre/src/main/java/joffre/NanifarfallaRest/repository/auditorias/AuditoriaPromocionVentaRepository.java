package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPromocionVenta;


@Repository
public interface AuditoriaPromocionVentaRepository extends JpaRepository<AuditoriaPromocionVenta, Integer> {

}
