package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Cliente_tiene_preferencia;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ClientetienePreferenciaRepository extends JpaRepository <Cliente_tiene_preferencia, Integer>{

}
