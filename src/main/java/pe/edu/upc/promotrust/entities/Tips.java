package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tips" )
public class Tips implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "contenido", nullable = false, length = 50)
    private String contenido;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;

}
