package pe.edu.upc.promotrust.dtos;

import java.time.LocalDateTime;

public class TipsDTO {

    private Long idtips;

    private String contenido;

    private LocalDateTime fecha_creacio;

    public Long getIdtips() {
        return idtips;
    }

    public void setIdtips(Long idtips) {
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
}
