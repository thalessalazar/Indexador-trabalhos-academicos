package dao;

import modelo.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer>{
    public UsuarioDAO(){
        super(Usuario.class);
    }
}
