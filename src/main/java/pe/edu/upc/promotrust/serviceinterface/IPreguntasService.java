package pe.edu.upc.promotrust.serviceinterface;

import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.entities.Preguntas;

import java.util.List;

public interface IPreguntasService {
    public List<Preguntas> list();

    public void insert(Preguntas preguntas);

    public void update(Preguntas preguntas);

    public void delete(int id);

    public  List<Preguntas> buscarP(String nombre);




}