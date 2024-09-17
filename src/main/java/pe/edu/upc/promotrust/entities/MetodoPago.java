package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MetodoPago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_metodo_pago",nullable = false)
    private int tipo_metodo_pago;

    public MetodoPago() {
    }

    public MetodoPago(int id, int tipo_metodo_pago) {
        this.id = id;
        this.tipo_metodo_pago = tipo_metodo_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_metodo_pago() {
        return tipo_metodo_pago;
    }

    public void setTipo_metodo_pago(int tipo_metodo_pago) {
        this.tipo_metodo_pago = tipo_metodo_pago;
    }
}
