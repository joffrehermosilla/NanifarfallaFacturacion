package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.TipoUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TipoUsuarioRepository extends JpaRepository <TipoUsuario, Integer>{

}
