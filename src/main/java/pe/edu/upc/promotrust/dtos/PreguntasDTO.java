package pe.edu.upc.promotrust.dtos;

import pe.edu.upc.promotrust.entities.Evaluacion;

public class PreguntasDTO {
    private int idPreguntas;
    private String descripcionPreguntas;
    private Evaluacion Evaluacion_id;

    public int getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(int idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public Evaluacion getEvaluacion_id() {
        return Evaluacion_id;
    }

    public void setEvaluacion_id(Evaluacion evaluacion_id) {
        Evaluacion_id = evaluacion_id;
    }

    public String getDescripcionPreguntas() {
        return descripcionPreguntas;
    }

    public void setDescripcionPreguntas(String descripcionPreguntas) {
        this.descripcionPreguntas = descripcionPreguntas;
    }
}
