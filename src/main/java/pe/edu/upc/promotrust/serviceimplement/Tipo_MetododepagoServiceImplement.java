package pe.edu.upc.promotrust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.promotrust.entities.Tipo_Metododepago;
import pe.edu.upc.promotrust.repositories.ITipo_MetododepagoRepository;
import pe.edu.upc.promotrust.serviceinterface.ITipo_MetododepagoService;
@Service
public class Tipo_MetododepagoServiceImplement implements ITipo_MetododepagoService {
    @Autowired
    private ITipo_MetododepagoRepository tmR;

    @Override
    public void insert(Tipo_Metododepago tipoMetododepago) {tmR.save(tipoMetododepago);}
}
