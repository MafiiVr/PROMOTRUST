package pe.edu.upc.promotrust.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "contrasenia", nullable = false, length = 100)
    private String contrasenia;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "RUC", nullable = false)
    private int RUC;

    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    private List<Roles> roles;

    @ManyToOne
    @JoinColumn(name = "idTips")
    private Tips tips;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String contrasenia, String apellidos, int telefono, String correo, int RUC, Boolean enabled, List<Roles> roles, Tips tips) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.RUC = RUC;
        this.enabled = enabled;
        this.roles = roles;
        this.tips = tips;
    }

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

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public Tips getTips() {
        return tips;
    }

    public void setTips(Tips tips) {
        this.tips = tips;
    }
}
