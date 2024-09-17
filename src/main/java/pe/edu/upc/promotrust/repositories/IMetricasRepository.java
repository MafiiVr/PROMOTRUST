package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Metricas;

import java.util.List;

@Repository
public interface IMetricasRepository extends JpaRepository<Metricas, Integer> {

    @Query(value = " SELECT c.id, SUM(m.ingresosgenerados)\n" +
            " FROM contrato c\n" +
            " JOIN metricas m ON c.id = m.id_contrato\n" +
            " GROUP BY c.id\n" +
            " ORDER BY SUM(m.ingresosgenerados) DESC;", nativeQuery = true) //siempre poner el nativeQuery = true
    public List<String []> totalingresos();
}
