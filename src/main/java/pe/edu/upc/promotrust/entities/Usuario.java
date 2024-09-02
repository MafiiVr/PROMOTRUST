package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;

    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;

    @Column(name = "contrasenia", nullable = false, length = 40)
    private String contrasenia;

    @Column(name = "apellidos", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "telefono", nullable = false)
    private int telefono;

    @Column(name = "correo", nullable = false, length = 40)
    private String correo;

    @Column(name = "RUC", nullable = false)
    private int RUC;

    @ManyToOne
    @JoinColumn(name = "tips_idtips")
    private Tips tips;

    @ManyToOne
    @JoinColumn(name = "id_Roles")
    private Roles roles;

}
