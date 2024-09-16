package pe.edu.upc.promotrust.dtos;

import pe.edu.upc.promotrust.entities.Contrato;

public class MetricasDTO {

    private int idMetrica;

    public int alcancepersonas;

    public double ingresosgenerados;

    public int likes;

    public String comentarios;

    public int compartidos;

    private Contrato contrato;

    public int getIdMetrica() {
        return idMetrica;
    }

    public void setIdMetrica(int idMetrica) {
        this.idMetrica = idMetrica;
    }

    public int getAlcancepersonas() {
        return alcancepersonas;
    }

    public void setAlcancepersonas(int alcancepersonas) {
        this.alcancepersonas = alcancepersonas;
    }

    public double getIngresosgenerados() {
        return ingresosgenerados;
    }

    public void setIngresosgenerados(double ingresosgenerados) {
        this.ingresosgenerados = ingresosgenerados;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getCompartidos() {
        return compartidos;
    }

    public void setCompartidos(int compartidos) {
        this.compartidos = compartidos;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
