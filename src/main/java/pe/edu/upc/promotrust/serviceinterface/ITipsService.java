package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Tips;

import java.util.List;
import java.util.Timer;

public interface ITipsService {

    public List<Tips> list();

    public void insert(Tips tips);


}
