package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Incidencias;

import java.util.List;

@Repository
public interface IIncidenciasRepository extends JpaRepository<Incidencias, Integer> {

    @Query("select r from Incidencias r where r.descripcionIncidencias like %:nombre%")
    public List<Incidencias> buscarI(@Param("nombre")String nombre);

    @Query("select r from Incidencias r order by r.fecha_Incidencia desc")
    public List<Incidencias> findMostRecentIncidencias();

    @Query(value = "SELECT i.id AS incidencia_id,i.descripcion_incidencias,i.fecha_incidencia,c.id AS id_contrato,c.detalle_contrato,c.estadocontrato\n" +
            "FROM incidencias i\n" +
            "JOIN contrato c\n" +
            "ON i.id_contrato = c.id\n" +
            "ORDER BY c.id;", nativeQuery = true)
    public List<String[]> listarindicenciasporcontrato();

}