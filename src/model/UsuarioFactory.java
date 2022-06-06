package model;

public class UsuarioFactory {
    public Usuario factory(String matricula, String senha)
    {
        return new Usuario(matricula, senha);
    }
    
}
