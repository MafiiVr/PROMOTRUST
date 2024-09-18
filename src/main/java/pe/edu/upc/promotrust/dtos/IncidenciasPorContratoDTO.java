package pe.edu.upc.promotrust.dtos;

import java.time.LocalDate;

public class IncidenciasPorContratoDTO {
    private int incidencia_id;
    private int id_contrato;
    private String descripcion_incidencias;
    private String detalle_contrato;
    private String estadocontrato;
    private LocalDate fecha_incidencia;


    public int getIncidencia_id() {
        return incidencia_id;
    }

    public void setIncidencia_id(int incidencia_id) {
        this.incidencia_id = incidencia_id;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getDescripcion_incidencias() {
        return descripcion_incidencias;
    }

    public void setDescripcion_incidencias(String descripcion_incidencias) {
        this.descripcion_incidencias = descripcion_incidencias;
    }

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public String getEstadocontrato() {
        return estadocontrato;
    }

    public void setEstadocontrato(String estadocontrato) {
        this.estadocontrato = estadocontrato;
    }

    public LocalDate getFecha_incidencia() {
        return fecha_incidencia;
    }

    public void setFecha_incidencia(LocalDate fecha_incidencia) {
        this.fecha_incidencia = fecha_incidencia;
    }

}
