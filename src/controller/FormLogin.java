/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.LoginView;
import view.MenuAView;

/**
 *
 * @author nicks
 */
public class FormLogin {
    
    private LoginView view;

    public FormLogin(LoginView view) {
        this.view = view;
    }
    
    public void autenticar() throws SQLException {
      
      String matricula = view.getjTextFieldmatricula().getText();
      String senha = view.getjPasswordFieldsenha().getText();
      
        Usuario usuarioexiste = new Usuario(matricula, senha);
        
         Connection conexaoo = new conexao().getConnection();
          UsuarioDAO usuariodao = new UsuarioDAO(conexaoo);
            
           boolean existe =  usuariodao.ExisteUsuario(usuarioexiste);
           
           if(existe){
            MenuAView telamenu = new MenuAView();
            telamenu.setVisible(true);
           }
           else {
               JOptionPane.showMessageDialog(view, "Usuario ou senha invalido");
           }
            
           
    }
}
