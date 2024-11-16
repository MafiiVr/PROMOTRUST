package pe.edu.upc.promotrust.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Servicio;

import java.util.List;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
    @Query(value = "SELECT categoria_servic, SUM(precio) " +
            "FROM Servicio " +
            "WHERE estado_servic = 'activo' " +
            "GROUP BY categoria_servic", nativeQuery = true)
    public List<String[]> obtenerDistribucionPorCategoria();
}
