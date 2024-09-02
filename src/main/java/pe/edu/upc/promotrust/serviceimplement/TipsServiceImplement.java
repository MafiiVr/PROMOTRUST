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
    private ITipsRepository iR;

    @Override
    public List<Tips> list() {
        return iR.findAll();
    }

    @Override
    public void insert(Tips tips) {
        iR.save(tips);

    }
}
