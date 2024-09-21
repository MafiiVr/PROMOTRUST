package pe.edu.upc.promotrust.dtos;

import java.time.LocalDate;

public class TipsPorUsuarioDTO {
    private int usuario_id;
    private String nombre_usuario;
    private String apellido_usuario;
    private int tip_id;
    private String contenido_tip;
    private LocalDate fecha_creacion_tip;

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public int getTip_id() {
        return tip_id;
    }

    public void setTip_id(int tip_id) {
        this.tip_id = tip_id;
    }

    public String getContenido_tip() {
        return contenido_tip;
    }

    public void setContenido_tip(String contenido_tip) {
        this.contenido_tip = contenido_tip;
    }

    public LocalDate getFecha_creacion_tip() {
        return fecha_creacion_tip;
    }

    public void setFecha_creacion_tip(LocalDate fecha_creacion_tip) {
        this.fecha_creacion_tip = fecha_creacion_tip;
    }
}
