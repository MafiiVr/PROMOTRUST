package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacion;
    @Column(name = "calificacion",nullable = false)
    private Integer calificacion;

    @Column(name = "comentarios", nullable = false, length = 100)
    private String comentarios;

    @Column(name = "fecha_evaluacion",nullable = false)
    public LocalDate fecha_evaluacion;

    @ManyToOne
    @JoinColumn(name = "idContratoUsuario")
    private ContratoUsuario contratoUsuario;

    public Evaluacion() {
    }

    public Evaluacion(int idEvaluacion, Integer calificacion, String comentarios, LocalDate fecha_evaluacion, ContratoUsuario contratoUsuario) {
        this.idEvaluacion = idEvaluacion;
        this.calificacion = calificacion;
        this.comentarios = comentarios;
        this.fecha_evaluacion = fecha_evaluacion;
        this.contratoUsuario = contratoUsuario;
    }

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
