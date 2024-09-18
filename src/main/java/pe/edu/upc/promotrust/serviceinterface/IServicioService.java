package pe.edu.upc.promotrust.serviceinterface;
import pe.edu.upc.promotrust.entities.Servicio;
import java.util.List;

public interface IServicioService {

    public void insert (Servicio servicio);

    public List<Servicio> list();

    public void delete (int id);

    public Servicio listid(int id);

}
