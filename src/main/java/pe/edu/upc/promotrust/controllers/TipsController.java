package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.TipsDTO;
import pe.edu.upc.promotrust.entities.Tips;
import pe.edu.upc.promotrust.serviceinterface.ITipsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tips")
public class TipsController {
    @Autowired
    private ITipsService tS;

    @GetMapping
    public List<TipsDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, TipsDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody TipsDTO tipsDTO){
        ModelMapper m=new ModelMapper();
        Tips t=m.map(tipsDTO, Tips.class);
        tS.insert(t);
    }

    @PutMapping
    public void editar(@RequestBody TipsDTO tipsDTO){
        ModelMapper m=new ModelMapper();
        Tips t=m.map(tipsDTO, Tips.class);
        tS.insert(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);

    }

    @GetMapping("/{id}")
    public TipsDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TipsDTO tp= m.map(tS.listId(id), TipsDTO.class);
        return tp;
    }
}
