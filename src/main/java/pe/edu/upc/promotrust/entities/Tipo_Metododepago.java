package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_Metododepago")
public class Tipo_Metododepago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "Tipo_Metodo_Pago",nullable = false, length = 50)
    private String Tipo_Metodo_Pago;

    public Tipo_Metododepago() {
    }

    public Tipo_Metododepago(int id, String tipo_Metodo_Pago) {
        Id = id;
        Tipo_Metodo_Pago = tipo_Metodo_Pago;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTipo_Metodo_Pago() {
        return Tipo_Metodo_Pago;
    }

    public void setTipo_Metodo_Pago(String tipo_Metodo_Pago) {
        Tipo_Metodo_Pago = tipo_Metodo_Pago;
    }
}
