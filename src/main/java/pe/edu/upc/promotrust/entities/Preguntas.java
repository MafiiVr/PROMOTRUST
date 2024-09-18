package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descripcionPreguntas", length = 35, nullable = false)
    private String descripcionPreguntas;
    @ManyToOne
    @JoinColumn(name = "idEvaluacion")
    private Evaluacion evaluacion;

    public Preguntas() {
    }

    public Preguntas(int id, String descripcionPreguntas, Evaluacion evaluacion) {
        this.id = id;
        this.descripcionPreguntas = descripcionPreguntas;
        this.evaluacion = evaluacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionPreguntas() {
        return descripcionPreguntas;
    }

    public void setDescripcionPreguntas(String descripcionPreguntas) {
        this.descripcionPreguntas = descripcionPreguntas;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
}
