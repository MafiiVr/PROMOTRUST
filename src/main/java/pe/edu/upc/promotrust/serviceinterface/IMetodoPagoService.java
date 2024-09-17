package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {
    public void insert(MetodoPago metodopago);
    public List<MetodoPago> list();
    public void delete(int id);
    public MetodoPago listId(int id);
}
