package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.promotrust.dtos.Tipo_MetododepagoDTO;
import pe.edu.upc.promotrust.entities.Tipo_Metododepago;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;
import pe.edu.upc.promotrust.serviceinterface.ITipo_MetododepagoService;

@RestController
@RequestMapping("/tipometododepago")
public class Tipo_MetododepagoController {
    @Autowired
    private ITipo_MetododepagoService tmpS;
    @PostMapping
    public void insertar(@RequestBody Tipo_MetododepagoDTO tipoMetododepagoDTO){
        ModelMapper e = new ModelMapper();
        Tipo_Metododepago tipoMetododepago=e.map(tipoMetododepagoDTO, Tipo_Metododepago.class);
        tmpS.insert(tipoMetododepago);
    }

}
