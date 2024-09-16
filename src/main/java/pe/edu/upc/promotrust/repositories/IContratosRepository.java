package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Contrato;

import java.util.List;

@Repository
public interface IContratosRepository extends JpaRepository<Contrato, Integer> {

    @Query(value = " SELECT c.estadocontrato, COUNT(m.id_metrica)\n" +
            "FROM contrato c\n" +
            "JOIN metricas m ON c.id_contrato = m.contratoid\n" +
            "GROUP BY c.estadocontrato;", nativeQuery = true)
    public List<String []> cantidadmetricascontrato ();


}
