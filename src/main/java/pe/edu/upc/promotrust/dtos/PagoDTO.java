package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.promotrust.entities.Contrato;

import java.time.LocalDateTime;

public class PagoDTO {
    private int Id;
    private float monto;
    private LocalDateTime fecha_pago;
    private ContratoDTO Contrato_Id;

    public ContratoDTO getContrato_Id() {
        return Contrato_Id;
    }

    public void setContrato_Id(ContratoDTO contrato_Id) {
        Contrato_Id = contrato_Id;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}
