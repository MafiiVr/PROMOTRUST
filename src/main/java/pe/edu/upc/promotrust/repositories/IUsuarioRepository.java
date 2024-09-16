package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository  extends JpaRepository <Usuario, Integer> {


    @Query(value = " select u.id, u.nombre, u.apellidos, u.correo, u.telefono, c.detalle_contrato, c.estadocontrato\n" +
            " from usuario u\n" +
            " inner join contrato c ON u.id = c.id_contrato\n" +
            " where c.estadocontrato = 'Activo'; \n", nativeQuery = true)
    public List<String[]> usuariocontraroactivo();



    @Query(value = "select u.nombre as Nombre_Usuario,  s.categoria_servic as Categoria_Servicio  from usuario u  \n" +
            "inner join contrato_usuario cu on cu.id_usuario = u.id\n" +
            "inner join contrato c on c.id_contrato= cu.contratoid\n" +
            "inner join servicio s on s.id_contrato=c.id_contrato\n" +
            "where s.categoria_servic = :categoria", nativeQuery = true)
    public List<String[]>listarUsuariosPorCategoria(@Param("categoria") String categoria);

}
