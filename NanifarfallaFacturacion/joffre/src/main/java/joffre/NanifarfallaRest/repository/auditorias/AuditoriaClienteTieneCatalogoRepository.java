package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaClienteTieneCatalogo;


@Repository
public interface AuditoriaClienteTieneCatalogoRepository extends JpaRepository<AuditoriaClienteTieneCatalogo, Integer> {

}
