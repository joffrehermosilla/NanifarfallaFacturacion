package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Alerta;


@Repository
public interface AlertaRepository extends JpaRepository<Alerta, Integer> {

}
