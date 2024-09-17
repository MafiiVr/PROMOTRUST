package pe.edu.upc.promotrust.dtos;



public class ContratoDTO {
    private int id;
    private String detalle_contrato;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
