package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaMenuRoles;



@Repository
public interface AuditoriaMenuRolesRepository extends JpaRepository<AuditoriaMenuRoles, Integer> {

}
