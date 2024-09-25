package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Incidencias")
public class Incidencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descripcionIncidencias", length = 100, nullable = false)
    private String descripcionIncidencias;
    @Column(name = "fecha_Incidencia", nullable = false)
    private LocalDate fecha_Incidencia;
    @ManyToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;

    public Incidencias() {
    }

    public Incidencias(int id, String descripcionIncidencias, LocalDate fecha_Incidencia, Contrato contrato) {
        this.id = id;
        this.descripcionIncidencias = descripcionIncidencias;
        this.fecha_Incidencia = fecha_Incidencia;
        this.contrato = contrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionIncidencias() {
        return descripcionIncidencias;
    }

    public void setDescripcionIncidencias(String descripcionIncidencias) {
        this.descripcionIncidencias = descripcionIncidencias;
    }

    public LocalDate getFecha_Incidencia() {
        return fecha_Incidencia;
    }

    public void setFecha_Incidencia(LocalDate fecha_Incidencia) {
        this.fecha_Incidencia = fecha_Incidencia;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
