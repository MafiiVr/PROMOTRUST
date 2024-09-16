package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Servicio;
import pe.edu.upc.promotrust.entities.Usuario;

import java.util.List;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {



}
