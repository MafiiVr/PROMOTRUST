package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Contrato")

public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;

    @Column(name = "detalle_contrato",length = 35,nullable = false)
    private String detalle_contrato;

    @Column(name = "fecha_inicio",nullable = false)
    private LocalDate fecha_inicio;

    @Column(name = "fecha_fin",nullable = false)
    private LocalDate fecha_fin;

    public Contrato(int idContrato, String detalle_contrato, LocalDate fecha_inicio, LocalDate fecha_fin) {
        this.idContrato = idContrato;
        this.detalle_contrato = detalle_contrato;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }


    public Contrato() {

    }

}
