package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Roles;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {
}
