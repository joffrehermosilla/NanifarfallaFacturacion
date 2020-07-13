package joffre.NanifarfallaRest.repository;

import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.Area;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AreaRepository extends JpaRepository <Area, Integer>{

}
