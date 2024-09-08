package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.repositories.IMetodoPagoRepository;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mpR;

    @Override
    public void insert(MetodoPago metodoPago) {mpR.save(metodoPago);
    }

    @Override
    public List<MetodoPago> list() {
        return mpR.findAll();
    }

    @Override
    public void delete(int idMetodopago) {
        mpR.deleteById(idMetodopago);
    }

    @Override
    public MetodoPago listId(int idMetodopago) {
        return mpR.findById(idMetodopago).orElse(new MetodoPago());
    }

    @Override
    public void update(MetodoPago metodoPago) {mpR.save(metodoPago);
    }
}
