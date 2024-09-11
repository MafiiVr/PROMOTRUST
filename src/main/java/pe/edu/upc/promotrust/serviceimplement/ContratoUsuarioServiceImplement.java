package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.ContratoUsuario;
import pe.edu.upc.promotrust.repositories.IContratoUsuarioRepository;
import pe.edu.upc.promotrust.serviceinterface.IContratoUsuarioService;

import java.util.List;

@Service
public class ContratoUsuarioServiceImplement implements IContratoUsuarioService {

    @Autowired
    private IContratoUsuarioRepository rCU;

    @Override
    public List<ContratoUsuario> list() {
        return rCU.findAll();
    }

    @Override
    public void insert(ContratoUsuario contratoUsuario) {
        rCU.save(contratoUsuario);

    }

    @Override
    public void delete(int id) {
        rCU.deleteById(id);

    }

    @Override
    public void update(ContratoUsuario contratoUsuario) {
        rCU.save(contratoUsuario);

    }
}
