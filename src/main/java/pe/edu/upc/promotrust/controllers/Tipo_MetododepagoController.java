package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.Tipo_MetododepagoDTO;
import pe.edu.upc.promotrust.entities.Tipo_Metododepago;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;
import pe.edu.upc.promotrust.serviceinterface.ITipo_MetododepagoService;

import java.util.List;
import java.util.stream.Collectors;

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
    @GetMapping
    public List<Tipo_MetododepagoDTO> listar() {
        return tmpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Tipo_MetododepagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        tmpS.delete(id);
    }
    @GetMapping("/{id}")
    public Tipo_MetododepagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        Tipo_MetododepagoDTO dto=m.map(tmpS.listId(id),Tipo_MetododepagoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody Tipo_MetododepagoDTO dto) {
        ModelMapper m = new ModelMapper();
        Tipo_Metododepago d = m.map(dto, Tipo_Metododepago.class);
        tmpS.update(d);
    }
}
