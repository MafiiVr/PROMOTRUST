package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Evaluacion;
import pe.edu.upc.promotrust.repositories.IEvaluacionRepository;
import pe.edu.upc.promotrust.serviceinterface.IEvaluacionService;

import java.util.List;

@Service
public class EvaluacionServiceImplement implements IEvaluacionService {
    @Autowired
    private IEvaluacionRepository eR;

    @Override
    public void insert(Evaluacion evaluacion) {
        eR.save(evaluacion);
    }

    @Override
    public List<Evaluacion> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Evaluacion listId(int id) {
        return eR.findById(id).orElse(new Evaluacion());
    }
}
