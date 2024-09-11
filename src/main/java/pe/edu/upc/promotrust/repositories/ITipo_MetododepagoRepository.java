package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Tipo_Metododepago;

@Repository
public interface ITipo_MetododepagoRepository extends JpaRepository<Tipo_Metododepago, Integer> {
}
