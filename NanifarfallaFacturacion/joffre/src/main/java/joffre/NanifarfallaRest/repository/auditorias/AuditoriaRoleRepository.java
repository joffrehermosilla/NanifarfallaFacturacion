package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaRole;


@Repository
public interface AuditoriaRoleRepository extends JpaRepository<AuditoriaRole, Integer> {

}
