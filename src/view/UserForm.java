package view;
import static model.UserData.ListaUsuarios;

import java.util.*;
import model.User;
import model.UserFactory;
import model.UserData;

public abstract class UserForm {

    public void menu(){};

    public  void mainUser()
    {
        telaInicial();
        menu();
    }

    public static User telaInicial()
    {
        Scanner sc1 = new Scanner(System.in);
        int select;
        User user1 =  new User(".", "." , ".", ".");
                
        
        System.out.println("---------------------");
        System.out.println("1. Entrar");
        System.out.println("2. Registrar");
        select = sc1.nextInt();

        switch(select)
        {
            case 1:
            {
                logar();
                break;
            }
            case 2: 
            {
                registrar();
                break;
            }
        }
        sc1.close();
        return user1;
        
    }
    
    public static void registrar()
    {
        Scanner sc1 = new Scanner(System.in);
        //fabricação de objeto

        UserFactory uf = new UserFactory();
        String nome, matricula, login, senha;
        
        System.out.printf("nome: ");
        nome = sc1.nextLine();
        System.out.printf("matrícula: ");
        matricula = sc1.nextLine();
        System.out.printf("login: ");
        login = sc1.nextLine();
        System.out.printf("senha: ");
        senha = sc1.nextLine();

        UserData.cadastrar(uf, nome, matricula, login, senha);
        sc1.close();
    }

    public static void logar()
    {
        Scanner sc2 = new Scanner(System.in);

        int i = 0, tam = ListaUsuarios.size();
        boolean userEncontrado = false;
        while(userEncontrado == false){
            System.out.printf("login: ");
            String login = sc2.nextLine();
            System.out.printf("senha: ");
            String senha = sc2.nextLine();
        
            //checa nos dados se o login e senha são compatíveis com algum user       
            for ( i=0; i<tam; i++ ) {
                if((login == ListaUsuarios.get(i).getLogin())&&senha == ListaUsuarios.get(i).getPassword()){
                    userEncontrado = true;
                    break;
                }
            }
            if(userEncontrado == false)
                System.out.println("login e/ou senha incorretos. Tente novamente");
        }
        sc2.close();
    }
}
