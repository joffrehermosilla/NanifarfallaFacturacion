package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Vendedor;
@Repository
public interface VendedorRepository extends JpaRepository <Vendedor, Integer>{

}
