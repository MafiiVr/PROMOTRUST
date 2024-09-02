package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.promotrust.entities.Roles;

public interface IRolesRepository extends JpaRepository<Roles, Integer> {
}
