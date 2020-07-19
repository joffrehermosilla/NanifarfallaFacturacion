package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Anuncio;


@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer> {

}
