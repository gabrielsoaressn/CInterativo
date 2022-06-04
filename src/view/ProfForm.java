package view;
import java.util.*;

public class ProfForm {
    
    public void menu(Scanner sc)
    {
        int select;      
        
        do
        {
            
            System.out.println("-------MENU-------");
            System.out.println("1. Ver Ranking");
            System.out.println("2. Ver avaliação");
            System.out.println("3. Sair");
            
            select = sc.nextInt();

            switch(select)
            {
            case 1:
                //gestor1.exibirRanking();
                break;
            case 2:
                //gestor.exibirAvaliacao();
                break;
            }
        }while(select != 3);
        System.out.println("Programa Encerrado");
    }    
}