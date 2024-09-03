package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Metricas")
public class Metricas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMetrica;

    @Column(name="alcancepersonas", nullable=false)
    public int alcancepersonas;

    @Column(name="ingresosgenerados", nullable=false)
    public double ingresosgenerados;

    @Column(name="likes", nullable=false)
    public int likes;

    @Column(name="comentarios", columnDefinition = "TEXT")
    public String comentarios;

    @Column(name="compartidos", nullable = false)
    public int compartidos;

    @ManyToOne
    @JoinColumn(name="contratoid")
    public Contrato contrato;

    public Metricas() {

    }

    public Metricas(int idMetrica, int alcancepersonas, double ingresosgenerados, int likes, String comentarios, int compartidos, Contrato contrato) {
        this.idMetrica = idMetrica;
        this.alcancepersonas = alcancepersonas;
        this.ingresosgenerados = ingresosgenerados;
        this.likes = likes;
        this.comentarios = comentarios;
        this.compartidos = compartidos;
        this.contrato = contrato;
    }

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
