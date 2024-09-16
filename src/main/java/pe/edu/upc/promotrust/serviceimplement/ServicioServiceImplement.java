package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Servicio;
import pe.edu.upc.promotrust.repositories.IServicioRepository;
import pe.edu.upc.promotrust.repositories.IUsuarioRepository;
import pe.edu.upc.promotrust.serviceinterface.IServicioService;
import pe.edu.upc.promotrust.serviceinterface.IUsuarioService;

import java.util.List;

@Service
public class ServicioServiceImplement implements IServicioService {
    @Autowired
    private IServicioRepository seR;

    @Override
    public void insert(Servicio servicio) {
        seR.save(servicio);

    }

    @Override
    public List<Servicio> list() {
        return seR.findAll();
    }

    @Override
    public void delete(int id) {
        seR.deleteById(id);

    }

    @Override
    public Servicio listid(int id) {
        return seR.findById(id).orElse(new Servicio());
    }
}
