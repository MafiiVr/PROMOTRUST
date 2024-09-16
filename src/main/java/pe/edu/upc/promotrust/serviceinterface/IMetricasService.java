package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Metricas;

import java.util.List;

public interface IMetricasService {

    public List<Metricas> list();

    public void insert(Metricas metricas);

    public void delete(int id);

    public void update(Metricas metricas);

    public List<String []> ingresosTotal();



}
