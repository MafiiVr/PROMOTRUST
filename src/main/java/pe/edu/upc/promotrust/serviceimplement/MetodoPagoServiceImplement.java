package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.repositories.IMetodoPagoRepository;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mpR;

    @Override
    public void insert(MetodoPago metodoPago) {mpR.save(metodoPago);
    }
}
