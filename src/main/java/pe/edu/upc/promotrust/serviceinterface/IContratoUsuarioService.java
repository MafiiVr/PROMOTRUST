package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.ContratoUsuario;

import java.util.List;

public interface IContratoUsuarioService {

    public List<ContratoUsuario> list();

    public void insert(ContratoUsuario contratoUsuario);

    public void delete(int id);

    public void update(ContratoUsuario contratoUsuario);
}
