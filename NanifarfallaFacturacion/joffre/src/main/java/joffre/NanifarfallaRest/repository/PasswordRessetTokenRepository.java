package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.PasswordRessetToken;


@Repository
public interface PasswordRessetTokenRepository extends JpaRepository<PasswordRessetToken, Integer> {

}
