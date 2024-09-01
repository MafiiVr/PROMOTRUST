package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Tips")
public class Tips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtips;

    @Column(name = "contenido", nullable = false, length = 100)
    private String contenido;

    @Column(name = "fecha_creacio", nullable = false)
    private LocalDateTime fecha_creacio;

    public Tips() {
    }

    public Tips(String contenido, LocalDateTime fecha_creacio, int idtips) {
        this.contenido = contenido;
        this.fecha_creacio = fecha_creacio;
        this.idtips = idtips;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFecha_creacio() {
        return fecha_creacio;
    }

    public void setFecha_creacio(LocalDateTime fecha_creacio) {
        this.fecha_creacio = fecha_creacio;
    }

    public int getIdtips() {
        return idtips;
    }

    public void setIdtips(int idtips) {
        this.idtips = idtips;
    }
}
