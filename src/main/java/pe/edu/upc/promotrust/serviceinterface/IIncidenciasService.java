package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.entities.MetodoPago;

import java.util.List;

public interface IIncidenciasService {
    public List<Incidencias> list();
    public void insert(Incidencias incidencias);
    public void delete(int id);
    public Incidencias listId(int id);
    public  List<Incidencias> buscarI(String nombre);
}
