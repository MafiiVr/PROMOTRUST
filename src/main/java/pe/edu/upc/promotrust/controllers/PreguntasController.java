package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.PreguntasDTO;
import pe.edu.upc.promotrust.entities.Preguntas;
import pe.edu.upc.promotrust.serviceinterface.IPreguntasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
@PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
public class PreguntasController {
    @Autowired
    private IPreguntasService iP ;

    @GetMapping
    public List<PreguntasDTO> listar() {
        return iP.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntasDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas pr = m.map(dto, Preguntas.class);
        iP.insert(pr);
    }
    @PutMapping
    public void modificar(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas pr = m.map(dto, Preguntas.class);
        iP.insert(pr);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        iP.delete(id);
    }

    @GetMapping("/{id}")
    public PreguntasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PreguntasDTO dto=m.map(iP.listId(id),PreguntasDTO.class);
        return dto;
    }

    @GetMapping("/busquedas")
    public List<PreguntasDTO> buscar(@RequestParam String nombre) {
        return iP.buscarP(nombre).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntasDTO.class);
        }).collect(Collectors.toList());
    }

}
