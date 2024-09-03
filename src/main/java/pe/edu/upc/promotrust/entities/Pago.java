package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "monto",nullable = false)
    private float monto;
    @Column(name = "fecha_pago",nullable = false)
    private LocalDateTime fecha_pago;
    @ManyToOne
    @JoinColumn(name = "Contrato_Id")
    private Contrato Contrato_Id;

    public Pago() {
    }

    public Pago(Contrato contrato_Id, int id, LocalDateTime fecha_pago, float monto) {
        Contrato_Id = contrato_Id;
        Id = id;
        this.fecha_pago = fecha_pago;
        this.monto = monto;
    }

    public Contrato getContrato_Id() {
        return Contrato_Id;
    }

    public void setContrato_Id(Contrato contrato_Id) {
        Contrato_Id = contrato_Id;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
