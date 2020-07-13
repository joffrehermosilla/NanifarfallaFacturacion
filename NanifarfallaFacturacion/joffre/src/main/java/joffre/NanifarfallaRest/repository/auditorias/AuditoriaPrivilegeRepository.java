package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPrivilege;
@Repository
public interface AuditoriaPrivilegeRepository extends JpaRepository<AuditoriaPrivilege, Integer> {

}
