package pe.edu.upc.promotrust.dtos;
import pe.edu.upc.promotrust.entities.Contrato;

public class MetricasDTO {

    private int id;
    private int alcancepersonas;
    private double ingresosgenerados;
    private int likes;
    private String comentarios;
    private int compartidos;
    private Contrato contrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
