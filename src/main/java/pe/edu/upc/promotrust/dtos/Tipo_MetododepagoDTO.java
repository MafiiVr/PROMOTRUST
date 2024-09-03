package pe.edu.upc.promotrust.dtos;


public class Tipo_MetododepagoDTO {
    private int Id;
    private String Tipo_Metodo_Pago;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipo_Metodo_Pago() {
        return Tipo_Metodo_Pago;
    }

    public void setTipo_Metodo_Pago(String tipo_Metodo_Pago) {
        Tipo_Metodo_Pago = tipo_Metodo_Pago;
    }
}
