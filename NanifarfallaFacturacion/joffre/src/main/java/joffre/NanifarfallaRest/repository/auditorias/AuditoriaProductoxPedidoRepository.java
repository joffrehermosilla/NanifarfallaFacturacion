package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaProductoxPedido;


@Repository
public interface AuditoriaProductoxPedidoRepository extends JpaRepository<AuditoriaProductoxPedido, Integer> {

}
