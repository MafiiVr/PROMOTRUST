package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.entities.Preguntas;
import pe.edu.upc.promotrust.repositories.IPreguntasRepository;
import pe.edu.upc.promotrust.serviceinterface.IPreguntasService;

import java.util.List;

@Service
public class PreguntasServiceImplement implements IPreguntasService {
    @Autowired
    private IPreguntasRepository pR;
    @Override
    public List<Preguntas> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Preguntas preguntas) {
        pR.save(preguntas);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Preguntas listId(int id) {
        return pR.findById(id).orElse(new Preguntas());
    }

    @Override
    public List<Preguntas> buscarP(String nombre) {
        return pR.buscarP(nombre);
    }

}



