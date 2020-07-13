package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.LoteInsumo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface LoteInsumoRepository extends JpaRepository <LoteInsumo, Integer> {

}
