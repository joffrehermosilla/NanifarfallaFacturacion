package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import joffre.NanifarfallaRest.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
