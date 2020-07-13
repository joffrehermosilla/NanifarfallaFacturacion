package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;
import joffre.NanifarfallaRest.model.Usuario;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
	@Transactional
	@Modifying
	@Query("UPDATE Usuario u SET u.estadousuario.codigo_estadousuario = :estado where u.codigo_usuario = :idUsuario")
	int updateEstado(@Param("estado") int idEstado, @Param("idUsuario") int id);
	
	@Query("SELECT CASE WHEN count(u) > 0 THEN true ELSE false END FROM Usuario u where u.nombre_logeo_usuario = :username AND u.password_usuario = :password and u.estadousuario.codigo_estadousuario=1")
	boolean login(@Param("username") String username, @Param("password") String password);
	
	@Query("SELECT u FROM Usuario u WHERE nombre_logeo_usuario=:username AND u.password_usuario = :password")
	Usuario getUsuarioLogin(@Param("username") String username, @Param("password") String password);
	
}
