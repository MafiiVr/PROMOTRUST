package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Pago;
import pe.edu.upc.promotrust.repositories.IPagoRepository;
import pe.edu.upc.promotrust.serviceinterface.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository pR;
    @Override
    public void insert(Pago pago) {pR.save(pago);}

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPago) {pR.deleteById(idPago);
    }

    @Override
    public Pago listId(int idPago) {
        return pR.findById(idPago).orElse(new Pago());
    }

    @Override
    public void update(Pago pago) {
        pR.save(pago);
    }
}
