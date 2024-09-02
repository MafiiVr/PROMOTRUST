package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Tips;

@Repository
public interface ITipsRepository extends JpaRepository<Tips, Integer> {
}
