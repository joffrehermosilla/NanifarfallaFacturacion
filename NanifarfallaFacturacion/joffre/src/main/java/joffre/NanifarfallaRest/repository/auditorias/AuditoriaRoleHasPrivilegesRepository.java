package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaRoleHasPrivileges;


@Repository
public interface AuditoriaRoleHasPrivilegesRepository extends JpaRepository<AuditoriaRoleHasPrivileges, Integer> {

}
