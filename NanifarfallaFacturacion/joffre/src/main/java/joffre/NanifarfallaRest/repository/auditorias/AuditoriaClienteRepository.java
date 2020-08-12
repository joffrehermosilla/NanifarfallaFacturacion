package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaCliente;


@Repository
public interface AuditoriaClienteRepository extends JpaRepository<AuditoriaCliente, Integer> {

}
