package model;
import java.util.*;

public class UserData {
    public static ArrayList<User> ListaUsuarios = new ArrayList<User>();
    
    public static void cadastrar(UserFactory uf, String nome, String matricula, String login, String senha) 
    {
        User gestor1 = uf.factory(2, nome, matricula, login, senha);
        ListaUsuarios.add(gestor1);
    }
}
