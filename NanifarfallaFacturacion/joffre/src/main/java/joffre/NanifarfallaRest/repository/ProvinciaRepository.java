package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Provincia;

@Repository
public interface ProvinciaRepository extends JpaRepository <Provincia, Integer>{

}
