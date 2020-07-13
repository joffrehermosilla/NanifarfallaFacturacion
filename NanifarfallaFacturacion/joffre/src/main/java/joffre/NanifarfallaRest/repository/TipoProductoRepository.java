package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.TipoProducto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TipoProductoRepository extends JpaRepository <TipoProducto, Integer>{

}
