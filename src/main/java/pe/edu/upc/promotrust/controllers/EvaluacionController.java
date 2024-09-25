package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.EvaluacionDTO;
import pe.edu.upc.promotrust.entities.Evaluacion;
import pe.edu.upc.promotrust.serviceinterface.IEvaluacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/evaluacion")
@PreAuthorize("hasAuthority('ADMIN')")
public class EvaluacionController {
    @Autowired
    private IEvaluacionService eS;

    @GetMapping
    public List<EvaluacionDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, EvaluacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody EvaluacionDTO dto){
        ModelMapper m=new ModelMapper();
        Evaluacion ct=m.map(dto, Evaluacion.class);
        eS.insert(ct);
    }

    @PutMapping
    public void Editar(@RequestBody EvaluacionDTO r){
        ModelMapper m=new ModelMapper();
        Evaluacion re = m.map(r,Evaluacion.class);
        eS.insert(re);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EvaluacionDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        EvaluacionDTO dto=m.map(eS.listId(id),EvaluacionDTO.class);
        return dto;
    }
}
