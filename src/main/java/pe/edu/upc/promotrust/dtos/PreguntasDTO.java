package pe.edu.upc.promotrust.dtos;
import pe.edu.upc.promotrust.entities.Evaluacion;

public class PreguntasDTO {
    private int id;
    private String descripcionPreguntas;
    private Evaluacion evaluacion;

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
