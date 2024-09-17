package pe.edu.upc.promotrust.serviceinterface;


import pe.edu.upc.promotrust.entities.Contrato;

import java.util.List;

public interface IContratoService {

    public List<Contrato> list();

    public void insert(Contrato contrato);

    public void delete(int id);
    public Contrato listID(int id);

    public List<String []> obtenerMetricasCantidad ();

}
