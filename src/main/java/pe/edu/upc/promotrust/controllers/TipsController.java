package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.CateogriaServiciosUsuriosDTO;
import pe.edu.upc.promotrust.dtos.TipsDTO;
import pe.edu.upc.promotrust.dtos.TipsPorUsuarioDTO;
import pe.edu.upc.promotrust.entities.Tips;
import pe.edu.upc.promotrust.serviceinterface.ITipsService;

import java.time.LocalDate;
import java.util.ArrayList;
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


    @GetMapping("/tips_usuario")
    public List<TipsPorUsuarioDTO> tipporusuario(){
        List<String[]> filaLista= tS.tipporusuario();
        List<TipsPorUsuarioDTO> dtoLista = new ArrayList<>();
        for(String[] columna:filaLista){
            TipsPorUsuarioDTO dto = new TipsPorUsuarioDTO();
            dto.setUsuario_id(Integer.parseInt(columna[0]));
            dto.setNombre_usuario(columna[1]);
            dto.setApellido_usuario(columna[2]);
            dto.setTip_id(Integer.parseInt(columna[3]));
            dto.setContenido_tip(columna[4]);
            dto.setFecha_creacion_tip(LocalDate.parse(columna[5]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
