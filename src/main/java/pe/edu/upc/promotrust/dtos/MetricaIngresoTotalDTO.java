package pe.edu.upc.promotrust.dtos;

import pe.edu.upc.promotrust.entities.Contrato;

public class MetricaIngresoTotalDTO {

    private int idcontrato;

    private double ingresostotales;

    public int getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(int idcontrato) {
        this.idcontrato = idcontrato;
    }

    public double getIngresostotales() {
        return ingresostotales;
    }

    public void setIngresostotales(double ingresostotales) {
        this.ingresostotales = ingresostotales;
    }
}

