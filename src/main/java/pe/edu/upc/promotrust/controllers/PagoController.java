package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.promotrust.dtos.PagoDTO;
import pe.edu.upc.promotrust.entities.Pago;
import pe.edu.upc.promotrust.serviceinterface.IPagoService;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private IPagoService pS;

    @PostMapping
    public void insertar(@RequestBody PagoDTO pagoDTO){
        ModelMapper e = new ModelMapper();
        Pago pago=e.map(pagoDTO, Pago.class);
        pS.insert(pago);
    }
}
