package dao;

import modelo.TipoUsuario;
       
public class TipoUsuarioDAO extends GenericDAO<TipoUsuario, Integer>{
    public TipoUsuarioDAO(){
        super(TipoUsuario.class);
    }
}