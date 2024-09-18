package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Tips;
import pe.edu.upc.promotrust.repositories.ITipsRepository;
import pe.edu.upc.promotrust.serviceinterface.ITipsService;

import java.util.List;
@Service
public class TipsServiceImplement implements ITipsService {
    @Autowired
    private ITipsRepository tR;

    @Override
    public List<Tips> list() {
        return tR.findAll();
    }

    @Override
    public void insert(Tips tips) {
        tR.save(tips);

    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public Tips listId(int id) {
        return tR.findById(id).orElse(new Tips());
    }

    @Override
    public List<String[]> listartipsporusuario() {
        return tR.listartipsporusuario();
    }
}
