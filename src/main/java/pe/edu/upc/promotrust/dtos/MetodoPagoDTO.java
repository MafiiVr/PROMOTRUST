package pe.edu.upc.promotrust.dtos;


public class MetodoPagoDTO {
    private int Id;
    private Tipo_MetododepagoDTO IDtipoMetododepago;
    private PagoDTO Pago_Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Tipo_MetododepagoDTO getIDtipoMetododepago() {
        return IDtipoMetododepago;
    }

    public void setIDtipoMetododepago(Tipo_MetododepagoDTO IDtipoMetododepago) {
        this.IDtipoMetododepago = IDtipoMetododepago;
    }

    public PagoDTO getPago_Id() {
        return Pago_Id;
    }

    public void setPago_Id(PagoDTO pago_Id) {
        Pago_Id = pago_Id;
    }
}
