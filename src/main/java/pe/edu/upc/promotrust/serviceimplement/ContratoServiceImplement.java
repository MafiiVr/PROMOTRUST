package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Contrato;
import pe.edu.upc.promotrust.repositories.IContratosRepository;
import pe.edu.upc.promotrust.serviceinterface.IContratoService;

import java.util.List;

@Service
public class ContratoServiceImplement implements IContratoService {

    @Autowired
    private IContratosRepository cR;

    @Override
    public List<Contrato> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Contrato contrato) {
        cR.save(contrato);

    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);

    }
}
