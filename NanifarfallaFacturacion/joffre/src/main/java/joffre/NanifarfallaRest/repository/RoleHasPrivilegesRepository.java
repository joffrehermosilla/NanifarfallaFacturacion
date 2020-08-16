package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.RoleHasPrivileges;


@Repository
public interface RoleHasPrivilegesRepository extends JpaRepository<RoleHasPrivileges, Integer> {

}
