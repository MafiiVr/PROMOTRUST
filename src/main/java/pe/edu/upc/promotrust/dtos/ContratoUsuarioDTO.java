package pe.edu.upc.promotrust.dtos;

import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Usuario;

import java.time.LocalDate;

public class ContratoUsuarioDTO {

    private int idContratoUsuario;

    public LocalDate fecha_inicio;

    public LocalDate fecha_fin;

    private Contrato contrato;

    private Usuario usuario;

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
