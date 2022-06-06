/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.MenuADAO;
import dao.UsuarioDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Menua;
import view.CadastroView;
import view.MenuAView;
/**
 *
 * @author nicks
 */
public class FormMenua {
    
     private MenuAView view;

    public FormMenua(MenuAView view) {
        this.view = view;
    }
    
    public void comentar(){
        
        
        
        String nomea = view.getjTextFieldnomea().getText();
        String cadeira = view.getjTextFieldcadeira().getText();
        String nota = view.getjTextFieldnota().getText();
        String comentar = view.getjTextAreacomentar().getText();
        
        
      Menua aluno = new Menua(nomea, cadeira, nota, comentar);
        try {
            Connection conexaoo = new conexao().getConnection();
            MenuADAO menudao = new MenuADAO(conexaoo);
            menudao.comentar(aluno);
            
            JOptionPane.showMessageDialog(null, "Comentario publicado!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    
}
