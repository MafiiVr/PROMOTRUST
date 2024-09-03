package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.promotrust.entities.Servicio;

public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
}
