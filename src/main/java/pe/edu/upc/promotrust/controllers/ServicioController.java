package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.ServicioDTO;
import pe.edu.upc.promotrust.dtos.UsuarioDTO;
import pe.edu.upc.promotrust.entities.Servicio;
import pe.edu.upc.promotrust.entities.Usuario;
import pe.edu.upc.promotrust.serviceinterface.IServicioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    private IServicioService seS;

    @PostMapping
    @PreAuthorize("hasAuthority('USUARIO')")
    public void registrar(@RequestBody ServicioDTO dto) {
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        seS.insert(s);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ServicioDTO> listar() {
        return seS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ServicioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        seS.delete(id);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ServicioDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ServicioDTO s= m.map(seS.listid(id),ServicioDTO.class);
        return s;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void editar(@RequestBody ServicioDTO servicioDTO) {
        ModelMapper m=new ModelMapper();
        Servicio s=m.map(servicioDTO, Servicio.class);
        seS.insert(s);
    }
}
