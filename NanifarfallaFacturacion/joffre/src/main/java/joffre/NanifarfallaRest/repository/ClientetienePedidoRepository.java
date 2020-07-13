package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Cliente_tiene_pedido;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ClientetienePedidoRepository extends JpaRepository <Cliente_tiene_pedido, Integer>{

}
