package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Privilege;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {

}
