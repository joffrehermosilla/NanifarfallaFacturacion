package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {

}
