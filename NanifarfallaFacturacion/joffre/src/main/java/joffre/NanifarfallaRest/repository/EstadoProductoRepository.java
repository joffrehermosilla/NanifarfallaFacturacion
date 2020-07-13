package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.EstadoProducto;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EstadoProductoRepository extends JpaRepository <EstadoProducto, Integer>{

}
