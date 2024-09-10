package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Incidencias")
public class Incidencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidencia;
    @Column(name = "descripcionIncidencias", length = 35, nullable = false)
    private String descripcionIncidencias;
    @Column(name = "fecha_Incidencia", nullable = false)
    private LocalDate fecha_Incidencia;
    @ManyToOne
    @JoinColumn(name = "Contrato_id")
    private Contrato Contrato_id;

    public Incidencias() {
    }
    public Incidencias(String descripcionIncidencias, LocalDate fecha_Incidencia, Contrato Contrato_id) {
        this.descripcionIncidencias = descripcionIncidencias;
        this.fecha_Incidencia = fecha_Incidencia;
        this.Contrato_id = Contrato_id;
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
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

    public Contrato getContrato_id() {
        return Contrato_id;
    }

    public void setContrato_id(Contrato contrato_id) {
        Contrato_id = contrato_id;
    }
}
