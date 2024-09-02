package pe.edu.upc.promotrust.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.promotrust.dtos.TipsDTO;
import pe.edu.upc.promotrust.entities.Tips;
import pe.edu.upc.promotrust.serviceinterface.ITipsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tips")
public class TipsController {

    @Autowired
    private ITipsService sT;

    @GetMapping
    public List<Tips>listar(){

        return sT.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,Tips.class);
        }).collect(Collectors.toList());

    }

    @PostMapping
    public void insertar(@RequestBody TipsDTO dto){
       ModelMapper m = new ModelMapper();
       Tips x = m.map(dto, Tips.class);
        sT.insert(x);
    }

}
