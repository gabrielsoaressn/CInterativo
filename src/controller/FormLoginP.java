/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.UsuarioPDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Loginprofessor;
import view.MenuPView;
/**
 *
 * @author nicks
 */
public class FormLoginP {
    
    private Loginprofessor view;

    public FormLoginP(Loginprofessor view) {
        this.view = view;
    }
    
    public void autenticar() throws SQLException {
      
      String matricula = view.getjTextFieldmatriculap().getText();
      String senha = view.getjPasswordFieldsenhap().getText();
      
        Usuario usuarioexistep = new Usuario(matricula, senha);
        
         Connection conexaoo = new conexao().getConnection();
          UsuarioPDAO usuariodao = new UsuarioPDAO(conexaoo);
            
           boolean existep =  usuariodao.ExisteUsuario(usuarioexistep);
           
           if(existep){
            MenuPView telamenu = new MenuPView();
            telamenu.setVisible(true);
           }
           else {
               JOptionPane.showMessageDialog(view, "Usuario ou senha invalido");
           }
            
           
    }
    
}
