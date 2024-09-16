package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.CantidadMetricasEstadoContratoDTO;
import pe.edu.upc.promotrust.dtos.ContratoDTO;
import pe.edu.upc.promotrust.dtos.IncidenciasDTO;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Incidencias;
import pe.edu.upc.promotrust.serviceinterface.IContratoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private IContratoService cS;

    @GetMapping
    public List<ContratoDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ContratoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody ContratoDTO dto){
        ModelMapper m=new ModelMapper();
        Contrato ct=m.map(dto, Contrato.class);
        cS.insert(ct);
    }

    @PutMapping
    public void modificar(@RequestBody ContratoDTO dto) {
        ModelMapper m = new ModelMapper();
        Contrato ct = m.map(dto, Contrato.class);
        cS.update(ct);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/cantidadmetricassegunestado")
    public List<CantidadMetricasEstadoContratoDTO> obtenerCantidad(){
        List<String[]>lista = cS.obtenerMetricasCantidad();
        List<CantidadMetricasEstadoContratoDTO>listaDTO=new ArrayList<>();
        for(String[]colummna:lista){
            CantidadMetricasEstadoContratoDTO dto=new CantidadMetricasEstadoContratoDTO();
            dto.setEstadocontrato(colummna[0]);
            dto.setCantidadmetricas(Integer.parseInt(colummna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
