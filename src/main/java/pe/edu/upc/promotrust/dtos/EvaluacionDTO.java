package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.*;
import pe.edu.upc.promotrust.entities.ContratoUsuario;

import java.time.LocalDate;

public class EvaluacionDTO {
    private int idEvaluacion;
    private Integer calificacion;
    private String comentarios;
    public LocalDate fecha_evaluacion;
    private ContratoUsuario contratoUsuario;

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public LocalDate getFecha_evaluacion() {
        return fecha_evaluacion;
    }

    public void setFecha_evaluacion(LocalDate fecha_evaluacion) {
        this.fecha_evaluacion = fecha_evaluacion;
    }

    public ContratoUsuario getContratoUsuario() {
        return contratoUsuario;
    }

    public void setContratoUsuario(ContratoUsuario contratoUsuario) {
        this.contratoUsuario = contratoUsuario;
    }
}
