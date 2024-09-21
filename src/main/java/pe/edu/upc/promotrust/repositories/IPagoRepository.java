package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Pago;

import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value="SELECT SUM(p.monto) AS total_monto_pagado, c.detalle_contrato, c.estadocontrato\n" +
            "FROM pago p\n" +
            "JOIN contrato c ON p.id_contrato = c.id\n" +
            "GROUP BY c.detalle_contrato, c.estadocontrato",nativeQuery = true)
    public List<String[]> obtenerMontoTotalPagosPorContrato();
}
