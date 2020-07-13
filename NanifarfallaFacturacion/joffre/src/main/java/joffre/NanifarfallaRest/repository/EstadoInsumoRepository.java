package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.EstadoInsumo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EstadoInsumoRepository extends JpaRepository <EstadoInsumo, Integer> {

}
