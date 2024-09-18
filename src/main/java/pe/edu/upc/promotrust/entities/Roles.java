package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"idUser", "tipo_rol"})})
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_rol", nullable = false, length = 20)
    private String tipoRol;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private Usuario usuario;

    public Roles() {
    }

    public Roles(int id, String tipoRol, Usuario usuario) {
        this.id = id;
        this.tipoRol = tipoRol;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

