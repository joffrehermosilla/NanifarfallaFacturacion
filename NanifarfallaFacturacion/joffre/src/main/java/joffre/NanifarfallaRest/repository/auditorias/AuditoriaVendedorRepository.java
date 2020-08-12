package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaVendedor;


@Repository
public interface AuditoriaVendedorRepository extends JpaRepository<AuditoriaVendedor, Integer> {

}
