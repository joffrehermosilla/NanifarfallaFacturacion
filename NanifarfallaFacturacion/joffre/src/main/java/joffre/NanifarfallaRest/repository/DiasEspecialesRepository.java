package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.DiasEspeciales;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface DiasEspecialesRepository extends JpaRepository <DiasEspeciales, Integer> {

}
