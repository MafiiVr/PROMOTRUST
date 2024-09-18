package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Evaluacion;

import java.util.List;

public interface IEvaluacionService {
    public void insert(Evaluacion evaluacion);
    public List<Evaluacion> list();
    public void delete(int id);
    public Evaluacion listId(int id);
}
