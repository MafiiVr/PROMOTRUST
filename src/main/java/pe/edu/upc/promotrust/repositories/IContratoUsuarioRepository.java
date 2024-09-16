package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.ContratoUsuario;

@Repository
public interface IContratoUsuarioRepository extends JpaRepository<ContratoUsuario, Integer> {

}
