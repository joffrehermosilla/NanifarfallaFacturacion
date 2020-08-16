package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Catalogo;


@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {

}
