package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.MetodoPago;
import pe.edu.upc.promotrust.repositories.IMetodoPagoRepository;
import pe.edu.upc.promotrust.serviceinterface.IMetodoPagoService;

import java.util.Collections;
import java.util.List;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mpR;


    @Override
    public void insert(MetodoPago metodopago) {
        mpR.save(metodopago);
    }

    @Override
    public List<MetodoPago> list() {
        return mpR.findAll();
    }

    @Override
    public void delete(int id) {
        mpR.deleteById(id);
    }

    @Override
    public MetodoPago listId(int id) {
        return mpR.findById(id).orElse(new MetodoPago());
    }


}
