package view;
import java.util.*;
import model.*;

public class GestorForm extends UserForm{
    
    @Override
    public void menu()
    {   
        int select = 0;
        Scanner scanner = new Scanner(System.in);
        
        int tam = UserData.ListaUsuarios.size() - 1;

        User gestor1 = UserData.ListaUsuarios.get(tam);
        do
        {
             
            System.out.println("-------MENU-------");
            System.out.println("1. Ver Ranking");
            System.out.println("2. Ver avaliação");
            System.out.println("3. Sair");
            
            select = scanner.nextInt();

            switch(select)
            {
            case 1:
                gestor1.verRanking();
                break;
            case 2:
                gestor1.verAvaliacao();
                break;
            }
        }while(select != 3);
        System.out.println("Programa Encerrado");    
    scanner.close();
    }



}