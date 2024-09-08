package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Pago;

import java.util.List;

public interface IPagoService {
    public void insert(Pago pago);
    public List<Pago> list();
    public void delete(int idPago);
    public Pago listId(int idPago);
    public void update(Pago pago);
}
