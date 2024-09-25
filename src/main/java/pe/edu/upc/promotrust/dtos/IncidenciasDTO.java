package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.promotrust.entities.Contrato;

import java.time.LocalDate;

public class IncidenciasDTO {

    private int id;
    private String descripcionIncidencias;
    private LocalDate fecha_Incidencia;
    private ContratoDTO contrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionIncidencias() {
        return descripcionIncidencias;
    }

    public void setDescripcionIncidencias(String descripcionIncidencias) {
        this.descripcionIncidencias = descripcionIncidencias;
    }

    public LocalDate getFecha_Incidencia() {
        return fecha_Incidencia;
    }

    public void setFecha_Incidencia(LocalDate fecha_Incidencia) {
        this.fecha_Incidencia = fecha_Incidencia;
    }

    public ContratoDTO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoDTO contrato) {
        this.contrato = contrato;
    }
}
