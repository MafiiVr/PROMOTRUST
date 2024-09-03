package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Servicio;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
}
