package pe.edu.upc.promotrust.dtos;

public class ObtenerPagosPorMetodoPagoDTO {

    private int tipo_metodo_pago;
    private int total_pagos;
    private float total_monto_pagado;

    public int getTipo_metodo_pago() {
        return tipo_metodo_pago;
    }

    public void setTipo_metodo_pago(int tipo_metodo_pago) {
        this.tipo_metodo_pago = tipo_metodo_pago;
    }

    public int getTotal_pagos() {
        return total_pagos;
    }

    public void setTotal_pagos(int total_pagos) {
        this.total_pagos = total_pagos;
    }

    public float getTotal_monto_pagado() {
        return total_monto_pagado;
    }

    public void setTotal_monto_pagado(float total_monto_pagado) {
        this.total_monto_pagado = total_monto_pagado;
    }
}
