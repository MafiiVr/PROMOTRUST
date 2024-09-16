package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPreguntas;
    @Column(name = "descripcionPreguntas", length = 35, nullable = false)
    private String descripcionPreguntas;
    //   @ManyToOne
    //@JoinColumn(name = "Evaluacion_id")
    // private Evaluacion Evaluacion_id;

    public Preguntas() {
    }
    public Preguntas(int idPreguntas, String descripcionPreguntas) {
        this.idPreguntas = idPreguntas;
        this.descripcionPreguntas = descripcionPreguntas;
        // this.Evaluacion_id = Evaluacion_id;
    }

    public int getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(int idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public String getDescripcionPreguntas() {
        return descripcionPreguntas;
    }

    public void setDescripcionPreguntas(String descripcionPreguntas) {
        this.descripcionPreguntas = descripcionPreguntas;
    }

//    public Evaluacion getEvaluacion_id() {
//        return Evaluacion_id;
//    }
//
//    public void setEvaluacion_id(Evaluacion evaluacion_id) {
//        Evaluacion_id = evaluacion_id;
//    }
}
