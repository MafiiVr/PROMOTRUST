package pe.edu.upc.promotrust.dtos;

public class UsuarioContratoActivoDTO {

    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String detalle_contrato;
    private String estadocontrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public String getEstadocontrato() {
        return estadocontrato;
    }

    public void setEstadocontrato(String estadocontrato) {
        this.estadocontrato = estadocontrato;
    }
}
