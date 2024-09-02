package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tips")
public class Tips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtips;

    @Column(name = "contenido", nullable = false, length = 100)
    private String contenido;

    @Column(name = "fecha_creacio", nullable = false)
    private LocalDateTime fecha_creacio;


}
