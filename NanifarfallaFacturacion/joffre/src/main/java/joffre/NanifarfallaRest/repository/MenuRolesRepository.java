package joffre.NanifarfallaRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.MenuRoles;

@Repository
public interface MenuRolesRepository extends JpaRepository<MenuRoles, Integer> {

}
