package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.NewLocationToken;
import joffre.NanifarfallaRest.model.UserLocation;


@Repository
public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {
    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);
}
