package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Zona_tieneDistrito;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Zona_tieneDistritoRepository extends JpaRepository <Zona_tieneDistrito, Integer> {

}
