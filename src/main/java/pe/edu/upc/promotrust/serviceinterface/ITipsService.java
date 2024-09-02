package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Tips;

import java.util.List;

public interface ITipsService {
    public List<Tips> list();

    public void insert(Tips tips);

    public void delete(int id);

    public Tips listId(int id);




}
