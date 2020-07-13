package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.RegimenCliente;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface RegimenClienteRepository extends JpaRepository <RegimenCliente, Integer>{

}
