package pe.edu.upc.promotrust.controllers;

import com.sun.jdi.IntegerValue;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.CateogriaServiciosUsuriosDTO;
import pe.edu.upc.promotrust.dtos.PreguntasDTO;
import pe.edu.upc.promotrust.dtos.UsuarioContratoActivoDTO;
import pe.edu.upc.promotrust.dtos.UsuarioDTO;
import pe.edu.upc.promotrust.entities.Usuario;
import pe.edu.upc.promotrust.serviceinterface.IUsuarioService;

import java.time.LocalDate;
import java.util.ArrayList;
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


    @GetMapping("/usuario_contrato_activo")
    public List<UsuarioContratoActivoDTO> usuariocontraroactivo(){
        List<String[]> filaLista= uS.usuariocontraroactivo();
        List<UsuarioContratoActivoDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            UsuarioContratoActivoDTO dto = new UsuarioContratoActivoDTO();
            dto.setId(Integer.parseInt(columna[0]));
            dto.setNombre(columna[1]);
            dto.setApellidos(columna[2]);
            dto.setCorreo(columna[3]);
            dto.setTelefono(columna[4]);
            dto.setDetalle_contrato(columna[5]);
            dto.setEstadocontrato(columna[6]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/Usuario_Categoria/{categoria}")
    public List<CateogriaServiciosUsuriosDTO> listarUsuariosPorCategoria(@PathVariable("categoria") String categoria){
        List<String[]> filaLista= uS.listarUsuariosPorCategoria(categoria);
        List<CateogriaServiciosUsuriosDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            CateogriaServiciosUsuriosDTO dto = new CateogriaServiciosUsuriosDTO();
            dto.setNombre_Usuario(columna[0]);
            dto.setCategoria_Servicio(columna[1]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }











}
