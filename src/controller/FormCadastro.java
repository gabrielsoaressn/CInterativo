/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.CadastroView;

/**
 *
 * @author nicks
 */
public class FormCadastro {
    
    private CadastroView view;

    public FormCadastro(CadastroView view) {
        this.view = view;
    }
    
    public void cadastrarUs(){
        
        
        
        String matricula = view.getjTextFieldmatricula().getText();
        String usuarioo = view.getjTextFieldusuario().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        
        
      Usuario usuario = new Usuario(matricula,usuarioo,senha);
        try {
            Connection conexaoo = new conexao().getConnection();
            UsuarioDAO usuariodao = new UsuarioDAO(conexaoo);
            usuariodao.insert(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    
}
