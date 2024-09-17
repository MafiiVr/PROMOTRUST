package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.repositories.IIncidenciasRepository;
import pe.edu.upc.promotrust.serviceinterface.IIncidenciasService;

import java.util.List;

@Service
public class  IncidenciasServiceImplement implements IIncidenciasService {
    @Autowired
    private IIncidenciasRepository iR;

    @Override
    public List<Incidencias> list() {return iR.findAll();}

    @Override
    public void insert(Incidencias incidencias) {iR.save(incidencias);}

    @Override
    public void delete(int id) {iR.deleteById(id);}

    @Override
    public Incidencias listId(int id) {
        return iR.findById(id).orElse(new Incidencias());
    }

    @Override
    public List<Incidencias> buscarI(String nombre) {
        return iR.buscarI(nombre);
    }




}