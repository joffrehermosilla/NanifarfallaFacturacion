package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoClienteTienePedido;


@Repository
public interface AuditoriaEstadoClienteTienePedidoRepository
		extends JpaRepository<AuditoriaEstadoClienteTienePedido, Integer> {

}
