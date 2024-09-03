package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "fvdispositivo")
    private Tipo_Metododepago fvdispositivo;
    @ManyToOne
    @JoinColumn(name = "Pago_Id")
    private Pago Pago_Id;

    public MetodoPago() {
    }

    public MetodoPago(Tipo_Metododepago fvdispositivo, int id, Pago pago_Id) {
        this.fvdispositivo = fvdispositivo;
        Id = id;
        Pago_Id = pago_Id;
    }

    public Tipo_Metododepago getFvdispositivo() {
        return fvdispositivo;
    }

    public void setFvdispositivo(Tipo_Metododepago fvdispositivo) {
        this.fvdispositivo = fvdispositivo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Pago getPago_Id() {
        return Pago_Id;
    }

    public void setPago_Id(Pago pago_Id) {
        Pago_Id = pago_Id;
    }
}
