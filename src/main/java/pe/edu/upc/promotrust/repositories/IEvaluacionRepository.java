package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Evaluacion;

@Repository
public interface IEvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
}
