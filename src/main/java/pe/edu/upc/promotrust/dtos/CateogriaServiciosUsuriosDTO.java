package pe.edu.upc.promotrust.dtos;

public class CateogriaServiciosUsuriosDTO {


    private String Nombre_Usuario;
    private String Categoria_Servicio;


    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getCategoria_Servicio() {
        return Categoria_Servicio;
    }

    public void setCategoria_Servicio(String categoria_Servicio) {
        Categoria_Servicio = categoria_Servicio;
    }
}
