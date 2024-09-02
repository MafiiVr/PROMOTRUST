package pe.edu.upc.promotrust.controllers;

import com.sun.jdi.IntegerValue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.TipsDTO;
import pe.edu.upc.promotrust.dtos.UsuarioDTO;
import pe.edu.upc.promotrust.entities.Tips;
import pe.edu.upc.promotrust.entities.Usuario;
import pe.edu.upc.promotrust.serviceinterface.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;


    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class); //transformamos el dto
        uS.insert(u);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }


    @GetMapping("/{id}")
    public UsuarioDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO u= m.map(uS.listid(id), UsuarioDTO.class);
        return u;
    }

    @PutMapping
    public void editar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario t=m.map(usuarioDTO, Usuario.class);
        uS.insert(t);
    }


}
