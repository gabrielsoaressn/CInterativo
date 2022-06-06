package model;

public class UsuarioPFactory {
    public UsuarioP factoryP(String matricula, String senha)
    {
        return new UsuarioP(matricula, senha);
    }
    
}
