package dao;

import modelo.Curso;

public class CursoDAO extends GenericDAO<Curso, Integer>{
    public CursoDAO(){
        super(Curso.class);
    }
}
