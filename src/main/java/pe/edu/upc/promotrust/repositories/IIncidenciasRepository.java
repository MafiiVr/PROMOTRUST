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

    @Query(value = "SELECT c.detalle_contrato AS nombre_contrato, COUNT(i.id) AS cantidad_incidencias " +
            "FROM incidencias i " +
            "JOIN contrato c ON i.id_contrato = c.id " +
            "GROUP BY c.detalle_contrato " +
            "ORDER BY cantidad_incidencias DESC;", nativeQuery = true)
    public List<String[]> listarindicenciasporcontrato();


}