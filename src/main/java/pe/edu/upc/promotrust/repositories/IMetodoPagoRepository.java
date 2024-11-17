package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.MetodoPago;

import java.util.List;

@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago, Integer> {
    @Query(value="SELECT \n" +
            "    mp.tipo_metodo_pago AS tipo_metodo_pago,\n" +
            "    COUNT(p.id) AS total_pagos,\n" +
            "    SUM(p.monto) AS total_monto_pagado\n" +
            "FROM \n" +
            "    pago p\n" +
            "JOIN \n" +
            "    metodo_pago mp ON p.id_metodo_pago = mp.id\n" +
            "GROUP BY \n" +
            "    mp.tipo_metodo_pago\n" +
            "ORDER BY \n" +
            "    mp.tipo_metodo_pago",nativeQuery = true)
    public List<String[]> obtenerPagosPorMetodoPago();
}
