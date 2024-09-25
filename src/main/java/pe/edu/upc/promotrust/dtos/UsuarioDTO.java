package pe.edu.upc.promotrust.dtos;
import pe.edu.upc.promotrust.entities.Tips;


public class UsuarioDTO {
    private int id;
    private String nombre;
    private String contrasenia;
    private String apellidos;
    private int telefono;
    private String correo;
    private String RUC;
    private TipsDTO tips;

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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public TipsDTO getTips() {
        return tips;
    }

    public void setTips(TipsDTO tips) {
        this.tips = tips;
    }
}
