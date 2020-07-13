package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.IgvVenta;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IgvVentaRepository extends JpaRepository <IgvVenta, Integer>{

}
