package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.entities.Pago;

import java.time.LocalDateTime;

public class PagoDTO {
    private int id;
    private float monto;
    private LocalDateTime fecha_pago;
    private ContratoDTO contrato;
    private MetodoPagoDTO metodopago;

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

    public ContratoDTO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoDTO contrato) {
        this.contrato = contrato;
    }

    public MetodoPagoDTO getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(MetodoPagoDTO metodopago) {
        this.metodopago = metodopago;
    }
}
