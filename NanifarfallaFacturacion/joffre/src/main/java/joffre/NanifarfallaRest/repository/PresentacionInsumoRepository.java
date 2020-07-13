package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.PresentacionInsumo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PresentacionInsumoRepository extends JpaRepository <PresentacionInsumo, Integer> {

}
