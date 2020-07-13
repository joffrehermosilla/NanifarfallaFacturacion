package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Factura_ctienepedido;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface Factura_ctienepedidoRepository extends JpaRepository <Factura_ctienepedido, Integer>{

}
