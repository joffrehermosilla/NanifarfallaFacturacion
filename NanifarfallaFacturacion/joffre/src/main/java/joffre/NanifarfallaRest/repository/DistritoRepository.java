package joffre.NanifarfallaRest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository <Distrito, Integer> {

}
