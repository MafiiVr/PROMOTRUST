package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Tips;

import java.util.List;

@Repository
public interface ITipsRepository extends JpaRepository<Tips, Integer> {

    @Query("SELECT t FROM Tips t JOIN t.usuario u ORDER BY u.id")
    List<Tips> findAllTipsWithUsuarioDetails();

    List<String[]> listartipsporusuario();
}

