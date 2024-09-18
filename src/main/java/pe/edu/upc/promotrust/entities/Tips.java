package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Tips" )
public class Tips implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "contenido", nullable = false, length = 100)
    private String contenido;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;

    public Tips() {
    }

    public Tips(int id, String contenido, LocalDate fecha_creacion) {
        this.id = id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
