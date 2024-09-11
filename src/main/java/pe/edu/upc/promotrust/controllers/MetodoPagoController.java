package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.promotrust.dtos.MetodoPagoDTO;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;

@RestController
@RequestMapping("/metodopago")
public class MetodoPagoController {
    @Autowired
    private IMetodoPagoService mpS;
    @PostMapping
    public void insertar(@RequestBody MetodoPagoDTO metodoPagoDTO){
        ModelMapper e = new ModelMapper();
        MetodoPago metodoPago=e.map(metodoPagoDTO, MetodoPago.class);
        mpS.insert(metodoPago);
    }
}
