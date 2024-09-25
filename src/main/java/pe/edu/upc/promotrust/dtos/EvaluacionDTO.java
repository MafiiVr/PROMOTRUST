package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.*;
import pe.edu.upc.promotrust.entities.ContratoUsuario;

import java.time.LocalDate;

public class EvaluacionDTO {
    private int id;
    private Integer calificacion;
    private String comentarios;
    private LocalDate fecha_evaluacion;
    private ContratoUsuarioDTO contratoUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ContratoUsuarioDTO getContratoUsuario() {
        return contratoUsuario;
    }

    public void setContratoUsuario(ContratoUsuarioDTO contratoUsuario) {
        this.contratoUsuario = contratoUsuario;
    }
}
