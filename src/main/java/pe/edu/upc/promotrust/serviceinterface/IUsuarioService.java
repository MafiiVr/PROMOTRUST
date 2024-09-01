package pe.edu.upc.promotrust.serviceinterface;

import pe.edu.upc.promotrust.entities.Usuario;

import java.util.List;

public interface IUsuarioService{

    public void insert (Usuario usuario); //crear nuevos usuarios

    public List<Usuario> list();

    public void update (Usuario usuario);

    public void delete (int id);

}
