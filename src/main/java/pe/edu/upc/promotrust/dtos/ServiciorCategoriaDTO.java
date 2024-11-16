package pe.edu.upc.promotrust.dtos;

public class ServiciorCategoriaDTO {

    private String categoriaServic;
    private Double totalPrecio;


    public String getCategoriaServic() {
        return categoriaServic;
    }

    public void setCategoriaServic(String categoriaServic) {
        this.categoriaServic = categoriaServic;
    }

    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }
}
