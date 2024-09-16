package pe.edu.upc.promotrust.dtos;

import pe.edu.upc.promotrust.entities.Contrato;

import java.time.LocalDate;

public class IncidenciasDTO {

    private int idIncidencia;
    private String descripcionIncidencias;
    private LocalDate fecha_Incidencia;
    private Contrato Contrato_id;

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public LocalDate getFecha_Incidencia() {
        return fecha_Incidencia;
    }

    public void setFecha_Incidencia(LocalDate fecha_Incidencia) {
        this.fecha_Incidencia = fecha_Incidencia;
    }

    public String getDescripcionIncidencias() {
        return descripcionIncidencias;
    }

    public void setDescripcionIncidencias(String descripcionIncidencias) {
        this.descripcionIncidencias = descripcionIncidencias;
    }

    public Contrato getContrato_id() {
        return Contrato_id;
    }

    public void setContrato_id(Contrato contrato_id) {
        Contrato_id = contrato_id;
    }
}
