package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaRecetaProductoTieneInsumo;
@Repository
public interface AuditoriaRecetaProductoTieneInsumoRepository
		extends JpaRepository<AuditoriaRecetaProductoTieneInsumo, Integer> {

}
