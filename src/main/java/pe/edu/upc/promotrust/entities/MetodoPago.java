package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "IDtipoMetododepago")
    private Tipo_Metododepago IDtipoMetododepago;
    @ManyToOne
    @JoinColumn(name = "Pago_Id")
    private Pago Pago_Id;

    public MetodoPago() {
    }

    public MetodoPago(int id, Tipo_Metododepago IDtipoMetododepago, Pago pago_Id) {
        Id = id;
        this.IDtipoMetododepago = IDtipoMetododepago;
        Pago_Id = pago_Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Tipo_Metododepago getIDtipoMetododepago() {
        return IDtipoMetododepago;
    }

    public void setIDtipoMetododepago(Tipo_Metododepago IDtipoMetododepago) {
        this.IDtipoMetododepago = IDtipoMetododepago;
    }

    public Pago getPago_Id() {
        return Pago_Id;
    }

    public void setPago_Id(Pago pago_Id) {
        Pago_Id = pago_Id;
    }
}
