package pe.edu.upc.promotrust.dtos;

public class ObtenerMontoTotalPagosPorContratoDTO {

    private float total_monto_pagado;
    private String detalle_contrato;
    private String estadocontrato;

    public String getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(String detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public String getEstadocontrato() {
        return estadocontrato;
    }

    public void setEstadocontrato(String estadocontrato) {
        this.estadocontrato = estadocontrato;
    }

    public float getTotal_monto_pagado() {
        return total_monto_pagado;
    }

    public void setTotal_monto_pagado(float total_monto_pagado) {
        this.total_monto_pagado = total_monto_pagado;
    }
}
