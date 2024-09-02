package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Roles;
import pe.edu.upc.promotrust.entities.Tips;

import java.util.List;

public interface IRolesService {

    public List<Roles> list();

    public void insert(Roles role);

    public void delete(int id);

    public Roles listId(int id);

}
