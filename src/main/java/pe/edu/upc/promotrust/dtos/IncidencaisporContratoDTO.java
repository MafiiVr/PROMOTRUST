package pe.edu.upc.promotrust.dtos;

public class IncidencaisporContratoDTO {
    private String  Nombre_Contrato;
    private int cantidad_incidencaias;

    public String getNombre_Contrato() {return Nombre_Contrato;}

    public void setNombre_Contrato(String nombre_Contrato) {Nombre_Contrato = nombre_Contrato;}

    public int getCantidad_incidencaias() {return cantidad_incidencaias;}

    public void setCantidad_incidencaias(int cantidad_incidencaias) {this.cantidad_incidencaias = cantidad_incidencaias;}
}
