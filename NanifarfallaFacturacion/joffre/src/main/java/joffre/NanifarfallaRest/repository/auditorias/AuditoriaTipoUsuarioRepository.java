package joffre.NanifarfallaRest.repository.auditorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoUsuario;


@Repository
public interface AuditoriaTipoUsuarioRepository extends JpaRepository<AuditoriaTipoUsuario, Integer> {

}
