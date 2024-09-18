package pe.edu.upc.promotrust.dtos;

public class MetodoPagoDTO {
    private int id;
    private int tipo_metodo_pago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_metodo_pago() {
        return tipo_metodo_pago;
    }

    public void setTipo_metodo_pago(int tipo_metodo_pago) {
        this.tipo_metodo_pago = tipo_metodo_pago;
    }
}
