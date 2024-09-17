package pe.edu.upc.promotrust.serviceimplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Roles;
import pe.edu.upc.promotrust.repositories.IRolesRepository;
import pe.edu.upc.promotrust.serviceinterface.IRolesService;

import java.util.List;

@Service
public class RolesServiceImplement implements IRolesService {
    @Autowired
    private IRolesRepository rRE;


    @Override
    public List<Roles> list() {
        return rRE.findAll();
    }

    @Override
    public void insert(Roles roles) {
        rRE.save(roles);
    }

    @Override
    public void delete(int id) {
        rRE.deleteById(id);
    }

    @Override
    public Roles listId(int id) {
        return rRE.findById(id).orElse(new Roles());
    }
}
