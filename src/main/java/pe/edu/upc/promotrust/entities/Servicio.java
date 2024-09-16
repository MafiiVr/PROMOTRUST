package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idservicio;

    @Column(name = "nombre_servicio", nullable = false, length = 40)
    private String nombre_servicio;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "categoria_servic", nullable = false, length = 80)
    private String categoria_servic;

    @Column(name = "estado_servic", nullable = false, length = 10)
    private String estado_servic;

    public Servicio() {
    }

    public Servicio(String categoria_servic, String descripcion, String estado_servic, int idservicio, String nombre_servicio, Double precio) {
        this.categoria_servic = categoria_servic;
        this.descripcion = descripcion;
        this.estado_servic = estado_servic;
        this.idservicio = idservicio;
        this.nombre_servicio = nombre_servicio;
        this.precio = precio;
    }

    public String getCategoria_servic() {
        return categoria_servic;
    }

    public void setCategoria_servic(String categoria_servic) {
        this.categoria_servic = categoria_servic;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public String getEstado_servic() {
        return estado_servic;
    }

    public void setEstado_servic(String estado_servic) {
        this.estado_servic = estado_servic;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
