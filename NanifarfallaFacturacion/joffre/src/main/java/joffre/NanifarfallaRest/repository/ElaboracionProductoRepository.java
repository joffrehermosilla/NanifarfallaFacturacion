package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.ElaboracionProducto;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ElaboracionProductoRepository extends JpaRepository <ElaboracionProducto, Integer>{

}
