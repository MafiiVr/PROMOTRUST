package pe.edu.upc.promotrust.dtos;


import pe.edu.upc.promotrust.entities.Contrato;

public class ServicioDTO {
    private int idservicio;

    private String nombre_servicio;

    private String descripcion;

    private Double precio;

    private String categoria_servic;

    private String estado_servic;

    private Contrato contrato;


    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
