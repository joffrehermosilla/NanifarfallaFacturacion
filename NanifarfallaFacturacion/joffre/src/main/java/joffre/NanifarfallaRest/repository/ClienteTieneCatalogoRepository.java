package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.ClienteTieneCatalogo;

@Repository
public interface ClienteTieneCatalogoRepository extends JpaRepository<ClienteTieneCatalogo, Integer> {

}
