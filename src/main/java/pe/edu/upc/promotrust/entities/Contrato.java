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


    @Column(name = "estado",length = 35,nullable = false)
    private String estado;

    public Contrato(int idContrato, String detalle_contrato, String estado) {
        this.idContrato = idContrato;
        this.detalle_contrato = detalle_contrato;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Contrato() {

    }

}
