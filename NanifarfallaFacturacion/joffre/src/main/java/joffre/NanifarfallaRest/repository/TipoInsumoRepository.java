package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.TipoInsumo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TipoInsumoRepository extends JpaRepository <TipoInsumo, Integer> {

}
