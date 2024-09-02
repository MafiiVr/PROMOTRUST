package pe.edu.upc.promotrust.dtos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.promotrust.entities.Roles;
import pe.edu.upc.promotrust.entities.Tips;

public class UsuarioDTO {

    private int idusuario;

    private String nombre;

    private String contrasenia;

    private String apellidos;

    private int telefono;

    private String correo;

    private int RUC;

    private Tips tips;

    private Roles roles;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public Tips getTips() {
        return tips;
    }

    public void setTips(Tips tips) {
        this.tips = tips;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
//Setters and getters

}
