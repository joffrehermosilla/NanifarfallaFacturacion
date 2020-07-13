package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository <Ciudad, Integer> {

}
