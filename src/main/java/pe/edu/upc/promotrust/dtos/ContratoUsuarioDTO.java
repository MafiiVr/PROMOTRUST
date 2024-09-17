package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Usuario;

import java.time.LocalDate;

public class ContratoUsuarioDTO {

    private int id;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Contrato contrato;
    private Usuario usuario;

    public ContratoUsuarioDTO() {
    }

    public ContratoUsuarioDTO(int id, LocalDate fecha_inicio, LocalDate fecha_fin, Contrato contrato, Usuario usuario) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.contrato = contrato;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
