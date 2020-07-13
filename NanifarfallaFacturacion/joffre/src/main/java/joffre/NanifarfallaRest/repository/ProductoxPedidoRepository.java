package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.ProductoxPedido;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductoxPedidoRepository extends JpaRepository <ProductoxPedido, Integer>{

}
