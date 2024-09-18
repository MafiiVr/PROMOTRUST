package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.MetodoPagoDTO;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

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
    @GetMapping
    public List<MetodoPagoDTO> listar() {
        return mpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MetodoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mpS.delete(id);
    }

    @GetMapping("/{id}")
    public MetodoPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        MetodoPagoDTO dto=m.map(mpS.listId(id),MetodoPagoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody MetodoPagoDTO dto) {
        ModelMapper m = new ModelMapper();
        MetodoPago d = m.map(dto, MetodoPago.class);
        mpS.insert(d);
    }
}
