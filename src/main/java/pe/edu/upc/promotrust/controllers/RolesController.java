package pe.edu.upc.promotrust.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.RolesDTO;
import pe.edu.upc.promotrust.entities.Roles;
import pe.edu.upc.promotrust.serviceinterface.IRolesService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private IRolesService rS;

    @GetMapping
    public List<RolesDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody RolesDTO dto){
        ModelMapper m=new ModelMapper();
        Roles ro=m.map(dto, Roles.class);
        rS.insert(ro);
    }

    @PutMapping
    public void editar(@RequestBody RolesDTO rolesDTO){
        ModelMapper m=new ModelMapper();
        Roles r=m.map(rolesDTO, Roles.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RolesDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RolesDTO rd= m.map(rS.listId(id), RolesDTO.class);
        return rd;
    }
}
