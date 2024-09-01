package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idroles;

    @Column(name = "tipo_rol", nullable = false, length = 20)
    private String tipo_rol;

    public Roles() {
    }

    public Roles(int idroles, String tipo_rol) {
        this.idroles = idroles;
        this.tipo_rol = tipo_rol;
    }

    public int getIdroles() {
        return idroles;
    }

    public void setIdroles(int idroles) {
        this.idroles = idroles;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }
}
