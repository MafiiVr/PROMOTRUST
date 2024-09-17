package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Roles;

import java.util.List;

public interface IRolesService {

    public List<Roles> list();
    public void insert(Roles roles);

    public void delete(int id);

    public Roles listId(int id);

}
