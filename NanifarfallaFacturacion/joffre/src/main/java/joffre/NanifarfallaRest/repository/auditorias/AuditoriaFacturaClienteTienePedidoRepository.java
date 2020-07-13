package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaFacturaClienteTienePedido;


@Repository
public interface AuditoriaFacturaClienteTienePedidoRepository
		extends JpaRepository<AuditoriaFacturaClienteTienePedido, Integer> {

}
