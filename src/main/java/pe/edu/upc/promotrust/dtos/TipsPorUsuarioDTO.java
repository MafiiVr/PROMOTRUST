package pe.edu.upc.promotrust.dtos;

public class TipsPorUsuarioDTO {
    private int id;
    private String contenido;
    private String fecha_creacion;
    private String nombre_usuario;


    public TipsPorUsuarioDTO(int id, String contenido, String fecha_creacion, String nombre_usuario) {
        this.id = id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
        this.nombre_usuario = nombre_usuario;
    }

    public int getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

}
