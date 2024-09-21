package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Tips;

import java.util.List;

@Repository
public interface ITipsRepository extends JpaRepository<Tips, Integer> {

    @Query(value = "SELECT u.id AS usuario_id, \n" +
            "       u.nombre AS nombre_usuario, \n" +
            "       u.apellidos AS apellidos_usuario, \n" +
            "       t.id AS tip_id, \n" +
            "       t.contenido AS contenido_tip, \n" +
            "       t.fecha_creacion AS fecha_creacion_tip\n" +
            "FROM usuario u\n" +
            "JOIN tips t ON u.id = t.id\n" +
            "ORDER BY u.id, t.fecha_creacion;", nativeQuery = true)
    public List<String[]> tipporusuario();


}


