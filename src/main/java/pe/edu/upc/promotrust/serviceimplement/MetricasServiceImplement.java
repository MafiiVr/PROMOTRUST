package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Metricas;
import pe.edu.upc.promotrust.repositories.IMetricasRepository;
import pe.edu.upc.promotrust.serviceinterface.IMetricasService;

import java.util.List;

@Service
public class MetricasServiceImplement implements IMetricasService {

    @Autowired
    private IMetricasRepository mR;

    @Override
    public List<Metricas> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Metricas metricas) {
        mR.save(metricas);

    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);

    }

    @Override
    public void update(Metricas metricas) {
        mR.save(metricas);
    }

    @Override
    public List<String[]> ingresosTotal() {
        return mR.totalingresos();
    }

}
