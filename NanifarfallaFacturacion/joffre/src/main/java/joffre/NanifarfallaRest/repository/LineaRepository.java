package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Linea;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface LineaRepository extends JpaRepository <Linea, Integer>{

}
