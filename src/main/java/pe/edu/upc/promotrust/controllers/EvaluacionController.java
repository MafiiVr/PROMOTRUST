package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.ContratoDTO;
import pe.edu.upc.promotrust.dtos.EvaluacionDTO;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Evaluacion;
import pe.edu.upc.promotrust.serviceinterface.IEvaluacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Evaluacion")
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
}
