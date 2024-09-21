package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public void insertar(@RequestBody MetodoPagoDTO metodoPagoDTO){
        ModelMapper e = new ModelMapper();
        MetodoPago metodoPago=e.map(metodoPagoDTO, MetodoPago.class);
        mpS.insert(metodoPago);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public List<MetodoPagoDTO> listar() {
        return mpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MetodoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        mpS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public MetodoPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        MetodoPagoDTO dto=m.map(mpS.listId(id),MetodoPagoDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public void modificar(@RequestBody MetodoPagoDTO dto) {
        ModelMapper m = new ModelMapper();
        MetodoPago d = m.map(dto, MetodoPago.class);
        mpS.insert(d);
    }
}
