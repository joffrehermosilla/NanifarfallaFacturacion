package joffre.NanifarfallaRest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import joffre.NanifarfallaRest.model.UserLocation;
import joffre.NanifarfallaRest.model.Usuario;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, Usuario user);

}
