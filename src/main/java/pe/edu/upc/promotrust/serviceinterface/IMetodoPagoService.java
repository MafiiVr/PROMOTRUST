package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {
    public void insert(MetodoPago metodoPago);
    public List<MetodoPago> list();
    public void delete(int idMetodopago);
    public MetodoPago listId(int idMetodopago);
    public void update(MetodoPago metodoPago);
}
