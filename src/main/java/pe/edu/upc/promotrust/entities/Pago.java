package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "monto",nullable = false)
    private float monto;
    @Column(name = "fecha_pago",nullable = false)
    private LocalDateTime fecha_pago;
    @ManyToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;
    @ManyToOne
    @JoinColumn(name = "idPago")
    private Pago pago;

    public Pago() {
    }

    public Pago(int id, float monto, LocalDateTime fecha_pago, Contrato contrato, Pago pago) {
        this.id = id;
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.contrato = contrato;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
