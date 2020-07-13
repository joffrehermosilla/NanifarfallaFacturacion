package joffre.NanifarfallaRest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Insumo;
@Repository
public interface InsumoRepository extends JpaRepository <Insumo, Integer>{

}
