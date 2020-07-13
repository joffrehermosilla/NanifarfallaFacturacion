package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Integer>{

}
