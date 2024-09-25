package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Metricas")
public class Metricas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="alcancepersonas", nullable=false)
    private int alcancepersonas;

    @Column(name="ingresosgenerados", nullable=false)
    private double ingresosgenerados;

    @Column(name="likes", nullable=false)
    private int likes;

    @Column(name="comentarios", nullable = false,length = 100)
    private String comentarios;

    @Column(name="compartidos", nullable = false)
    private int compartidos;

    @ManyToOne
    @JoinColumn(name="idContrato")
    private Contrato contrato;

    public Metricas() {
    }

    public Metricas(int id, int alcancepersonas, double ingresosgenerados, int likes, String comentarios, int compartidos, Contrato contrato) {
        this.id = id;
        this.alcancepersonas = alcancepersonas;
        this.ingresosgenerados = ingresosgenerados;
        this.likes = likes;
        this.comentarios = comentarios;
        this.compartidos = compartidos;
        this.contrato = contrato;
    }

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
