/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.UsuarioPDAO;
import dao.conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.CadastroProfessor;
/**
 *
 * @author nicks
 */
public class FormCadastroP {
    
      
    private CadastroProfessor view;

    public FormCadastroP(CadastroProfessor view) {
        this.view = view;
    }
    
    public void cadastrarUsP(){
        
        
        
        String matricula = view.getjTextFieldmatriculap().getText();
        String usuarioo = view.getjTextFieldusuariop().getText();
        String senha = view.getjPasswordFieldsenhap().getText();
        
        
      Usuario usuariop = new Usuario(matricula,usuarioo,senha);
        try {
            Connection conexaoop = new conexao().getConnection();
            UsuarioPDAO usuariodao = new UsuarioPDAO(conexaoop);
            usuariodao.insert(usuariop);
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    
    
}
