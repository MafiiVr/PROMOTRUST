package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.MetodoPago;

import java.util.List;

@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
    @Query(value="SELECT mp.tipo_metodo_pago, COUNT(p.id) AS total_pagos, SUM(p.monto) AS total_monto_pagado\n" +
            "FROM metodo_pago mp\n" +
            "JOIN Pago p ON mp.id = p.id\n" +
            "GROUP BY mp.tipo_metodo_pago",nativeQuery = true)
    public List<String[]> obtenerPagosPorMetodoPago();
}
