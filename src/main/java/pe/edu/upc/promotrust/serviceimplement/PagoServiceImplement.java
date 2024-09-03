package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Pago;
import pe.edu.upc.promotrust.repositories.IPagoRepository;
import pe.edu.upc.promotrust.serviceinterface.IPagoService;

@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository pR;
    @Override
    public void insert(Pago pago) {pR.save(pago);}
}
