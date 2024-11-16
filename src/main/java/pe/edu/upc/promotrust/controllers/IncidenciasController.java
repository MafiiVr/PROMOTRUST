package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.IncidencaisporContratoDTO;
import pe.edu.upc.promotrust.dtos.IncidenciasDTO;
import pe.edu.upc.promotrust.dtos.IncidenciasPorContratoDTO;
import pe.edu.upc.promotrust.dtos.PreguntasDTO;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.serviceinterface.IIncidenciasService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidencias")
public class IncidenciasController {
    @Autowired
    private IIncidenciasService iS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<IncidenciasDTO> list(){
        return iS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IncidenciasDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public void registrar(@RequestBody IncidenciasDTO dto) {
        ModelMapper m = new ModelMapper();
        Incidencias in = m.map(dto, Incidencias.class);
        iS.insert(in);
    }
    @PutMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public void modificar(@RequestBody IncidenciasDTO dto) {
        ModelMapper m = new ModelMapper();
        Incidencias in = m.map(dto, Incidencias.class);
        iS.insert(in);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        iS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public IncidenciasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        IncidenciasDTO dto=m.map(iS.listId(id),IncidenciasDTO.class);
        return dto;
    }

    @GetMapping("/busquedas")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public List<PreguntasDTO> buscar(@RequestParam String nombre) {
        return iS.buscarI(nombre).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntasDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/OrdenDescendiente")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public List<PreguntasDTO> Descentient() {
        return iS.findMostRecentIncidencias().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntasDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/incidencias_contrato")
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public List<IncidencaisporContratoDTO> listarindicenciasporcontrato() {
        // Recuperar los datos desde el servicio
        List<String[]> filaLista = iS.listarindicenciasporcontrato();

        // Convertir las filas en objetos DTO
        List<IncidencaisporContratoDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            IncidencaisporContratoDTO dto = new IncidencaisporContratoDTO();
            dto.setNombre_Contrato(columna[0]); // `nombre_contrato` desde el query
            dto.setCantidad_incidencaias(Integer.parseInt(columna[1])); // `cantidad_incidencias` desde el query
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
