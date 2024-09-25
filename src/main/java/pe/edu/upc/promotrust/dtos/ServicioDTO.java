package pe.edu.upc.promotrust.dtos;
import pe.edu.upc.promotrust.entities.Contrato;

public class ServicioDTO {
    private int id;
    private String nombre_servicio;
    private String descripcion;
    private Double precio;
    private String categoria_servic;
    private String estado_servic;
    private ContratoDTO contrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCategoria_servic() {
        return categoria_servic;
    }

    public void setCategoria_servic(String categoria_servic) {
        this.categoria_servic = categoria_servic;
    }

    public String getEstado_servic() {
        return estado_servic;
    }

    public void setEstado_servic(String estado_servic) {
        this.estado_servic = estado_servic;
    }

    public ContratoDTO getContrato() {
        return contrato;
    }

    public void setContrato(ContratoDTO contrato) {
        this.contrato = contrato;
    }
}
