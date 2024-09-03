package pe.edu.upc.promotrust.dtos;

import java.time.LocalDate;

public class ContratoDTO {

    private int idContrato;

    private String detalle_contrato;

    private LocalDate fecha_inicio;

    private LocalDate fecha_fin;

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
