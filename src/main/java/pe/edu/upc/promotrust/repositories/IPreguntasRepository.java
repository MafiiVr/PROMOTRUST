package pe.edu.upc.promotrust.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.promotrust.entities.Preguntas;

import java.util.List;

@Repository
public interface IPreguntasRepository extends JpaRepository<Preguntas, Integer> {


    @Query("select r from Preguntas r where r.descripcionPreguntas like %:nombre%")
    public List<Preguntas> buscarP(@Param("nombre")String nombre);


}
