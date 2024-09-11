package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ContratoUsuario")
public class ContratoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContratoUsuario;

    @Column(name = "fecha_incio",nullable = false)
    public LocalDate fecha_inicio;

    @Column(name = "fecha_fin",nullable = false)
    public LocalDate fecha_fin;

    @ManyToOne
    @JoinColumn(name="contratoid")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public ContratoUsuario() {
    }

    public ContratoUsuario(int idContratoUsuario, LocalDate fecha_inicio, LocalDate fecha_fin, Contrato contrato, Usuario usuario) {
        this.idContratoUsuario = idContratoUsuario;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.contrato = contrato;
        this.usuario = usuario;
    }

    public int getIdContratoUsuario() {
        return idContratoUsuario;
    }

    public void setIdContratoUsuario(int idContratoUsuario) {
        this.idContratoUsuario = idContratoUsuario;
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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
