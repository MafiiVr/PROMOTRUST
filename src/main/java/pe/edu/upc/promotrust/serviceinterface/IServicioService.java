package pe.edu.upc.promotrust.serviceinterface;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.entities.Servicio;
import pe.edu.upc.promotrust.entities.Usuario;


import java.util.List;

public interface IServicioService {


    public void insert (Servicio servicio); //crear nuevos usuarios

    public List<Servicio> list();

    public void delete (int id);

    public Servicio listid(int id);





}
