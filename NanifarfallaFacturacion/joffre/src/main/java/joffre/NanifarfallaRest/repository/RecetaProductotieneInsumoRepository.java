package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.RecetaProductotieneInsumo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface RecetaProductotieneInsumoRepository extends JpaRepository <RecetaProductotieneInsumo, Integer> {

}
