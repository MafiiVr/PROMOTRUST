package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "detalle_contrato",length = 100,nullable = false)
    private String detalle_contrato;

    @Column(name = "estadocontrato",length = 100,nullable = false)
    private String estado;

    public Contrato() {
    }

    public Contrato(int id, String detalle_contrato, String estado) {
        this.id = id;
        this.detalle_contrato = detalle_contrato;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
