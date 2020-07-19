package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.UserAnuncios;


@Repository
public interface UserAnunciosRepository extends JpaRepository<UserAnuncios, Integer> {

}
