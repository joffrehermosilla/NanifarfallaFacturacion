package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Pais;


@Repository
public interface  PaisRepository extends JpaRepository <Pais, Integer>{

}
