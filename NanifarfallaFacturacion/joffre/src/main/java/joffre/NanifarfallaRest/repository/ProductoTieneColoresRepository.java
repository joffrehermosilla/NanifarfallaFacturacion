package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.ProductoTieneColores;


@Repository
public interface ProductoTieneColoresRepository extends JpaRepository<ProductoTieneColores, Integer> {

}
