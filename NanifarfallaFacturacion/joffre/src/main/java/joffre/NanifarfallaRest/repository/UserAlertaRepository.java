package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.UserAlerta;

@Repository
public interface UserAlertaRepository extends JpaRepository<UserAlerta, Integer> {

}
