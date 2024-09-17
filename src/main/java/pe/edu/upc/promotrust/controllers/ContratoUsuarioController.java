package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.ContratoUsuarioDTO;
import pe.edu.upc.promotrust.entities.ContratoUsuario;
import pe.edu.upc.promotrust.serviceinterface.IContratoUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contratousuario")
public class ContratoUsuarioController {

    @Autowired
    private IContratoUsuarioService cCUS;

    @GetMapping
    public List<ContratoUsuarioDTO> listar(){
        return cCUS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ContratoUsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ContratoUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        ContratoUsuario ctu=m.map(dto, ContratoUsuario.class);
        cCUS.insert(ctu);
    }

    @PutMapping
    public void modificar(@RequestBody ContratoUsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        ContratoUsuario ctu= m.map(dto, ContratoUsuario.class);
        cCUS.insert(ctu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cCUS.delete(id);
    }

    @GetMapping("/{id}")
    public ContratoUsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ContratoUsuarioDTO dto=m.map(cCUS.listId(id),ContratoUsuarioDTO.class);
        return dto;
    }
}
