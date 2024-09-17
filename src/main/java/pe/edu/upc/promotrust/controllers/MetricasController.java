package pe.edu.upc.promotrust.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.promotrust.dtos.ContratoDTO;
import pe.edu.upc.promotrust.dtos.MetricaIngresoTotalDTO;
import pe.edu.upc.promotrust.dtos.MetricasDTO;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.entities.Metricas;
import pe.edu.upc.promotrust.serviceinterface.IMetricasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metricas")
public class MetricasController {

    @Autowired
    private IMetricasService mS;

    @GetMapping
    public List<MetricasDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MetricasDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody  MetricasDTO dto){
        ModelMapper m=new ModelMapper();
        Metricas met=m.map(dto, Metricas.class);
        mS.insert(met);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody MetricasDTO dto) {
        ModelMapper m = new ModelMapper();
        Metricas met = m.map(dto, Metricas.class);
        mS.insert(met);
    }

    @GetMapping("/{id}")
    public MetricasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        MetricasDTO dto=m.map(mS.listId(id),MetricasDTO.class);
        return dto;
    }

    @GetMapping("/metricaingresototal")
    public List<MetricaIngresoTotalDTO> obtenerIngresosTotal(){
        List<String[]>lista = mS.ingresosTotal();
        List<MetricaIngresoTotalDTO>listaDTO=new ArrayList<>();
        for(String[]colummna:lista){
            MetricaIngresoTotalDTO dto=new MetricaIngresoTotalDTO();
            dto.setIdcontrato(Integer.parseInt(colummna[0]));
            dto.setIngresostotales(Double.parseDouble(colummna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}
