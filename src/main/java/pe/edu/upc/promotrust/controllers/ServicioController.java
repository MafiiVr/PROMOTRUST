package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.ServicioDTO;
import pe.edu.upc.promotrust.dtos.ServiciorCategoriaDTO;
import pe.edu.upc.promotrust.dtos.UsuarioDTO;
import pe.edu.upc.promotrust.entities.Servicio;
import pe.edu.upc.promotrust.entities.Usuario;
import pe.edu.upc.promotrust.serviceinterface.IServicioService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    private IServicioService seS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN', 'INFLUENCER')")
    public void registrar(@RequestBody ServicioDTO dto) {
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        seS.insert(s);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN', 'INFLUENCER')")
    public List<ServicioDTO> listar() {
        return seS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ServicioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN', 'INFLUENCER')")
    public void eliminar(@PathVariable("id") Integer id) {
        seS.delete(id);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN', 'INFLUENCER')")
    public ServicioDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ServicioDTO s= m.map(seS.listid(id),ServicioDTO.class);
        return s;
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN', 'INFLUENCER')")
    public void editar(@RequestBody ServicioDTO servicioDTO) {
        ModelMapper m=new ModelMapper();
        Servicio s=m.map(servicioDTO, Servicio.class);
        seS.insert(s);
    }
    @GetMapping("/ServicioxCatgoria")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ServiciorCategoriaDTO> obtenerDistribucionPorCategoria() {
        // Recuperar los datos desde el repositorio
        List<String[]> filaLista = seS.obtenerDistribucionPorCategoria();

        // Convertir las filas en objetos DTO
        List<ServiciorCategoriaDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            ServiciorCategoriaDTO dto = new ServiciorCategoriaDTO();
            dto.setCategoriaServic(columna[0]); // categoria_servic desde el query
            dto.setTotalPrecio(Double.parseDouble(columna[1])); // total_precio desde el query
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
