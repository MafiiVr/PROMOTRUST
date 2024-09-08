package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Tipo_Metododepago;

import java.util.List;

public interface ITipo_MetododepagoService {
    public void insert(Tipo_Metododepago tipoMetododepago);
    public List<Tipo_Metododepago> list();
    public void delete(int idMetododepago );
    public Tipo_Metododepago listId(int idMetododepago);
    public void update(Tipo_Metododepago tipoMetododepago);
}
