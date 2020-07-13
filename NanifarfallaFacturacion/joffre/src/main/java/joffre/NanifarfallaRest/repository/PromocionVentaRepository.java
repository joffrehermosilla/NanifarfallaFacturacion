package joffre.NanifarfallaRest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import joffre.NanifarfallaRest.model.PromocionVenta;
@Repository
public interface PromocionVentaRepository extends JpaRepository <PromocionVenta, Integer>{

}
