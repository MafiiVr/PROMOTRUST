package pe.edu.upc.promotrust.serviceinterface;


import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Incidencias;

import java.util.List;

public interface IContratoService {

    public List<Contrato> list();

    public void insert(Contrato contrato);

    public void delete(int id);

    public void update(Contrato contrato);

    public List<String []> obtenerMetricasCantidad ();

}
