package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.promotrust.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Cambiado a findByNombre
    public Usuario findByNombre(String nombre);

    @Query("select count(u.nombre) from Usuario u where u.nombre =:nombre")
    public int buscarUsername(@Param("nombre") String nombre);

    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, idUser) VALUES (:rol, :idUser)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("idUser") Long idUser);

    @Query(value = "select u.id, u.nombre, u.apellidos, u.correo, u.telefono, c.detalle_contrato, c.estadocontrato " +
            "from usuario u " +
            "inner join contrato c ON u.id = c.id_contrato " +
            "where c.estadocontrato = 'Activo';", nativeQuery = true)
    public List<String[]> usuariocontraroactivo();

    @Query(value = "select u.nombre as Nombre_Usuario, s.categoria_servic as Categoria_Servicio from usuario u " +
            "inner join contrato_usuario cu on cu.id_usuario = u.id " +
            "inner join contrato c on c.id_contrato= cu.contratoid " +
            "inner join servicio s on s.id_contrato=c.id_contrato " +
            "where s.categoria_servic = :categoria", nativeQuery = true)
    public List<String[]> listarUsuariosPorCategoria(@Param("categoria") String categoria);
}
