package pe.edu.upc.promotrust.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "Roles")
    public class Roles {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idRoles;
        @Column(name = "tipo_rol", nullable = false, length = 20)
        private String tipoRol;
    }

