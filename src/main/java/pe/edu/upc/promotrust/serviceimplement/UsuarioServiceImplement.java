package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Usuario;
import pe.edu.upc.promotrust.repositories.IUsuarioRepository;
import pe.edu.upc.promotrust.serviceinterface.IUsuarioService;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uS;

    @Override
    public void insert(Usuario usuario) {
        uS.save(usuario);
    }
}
