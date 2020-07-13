package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.EstadoUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EstadoUsuarioRepository extends JpaRepository <EstadoUsuario, Integer> {

}
