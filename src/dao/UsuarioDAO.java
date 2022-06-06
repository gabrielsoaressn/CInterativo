/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Menua;
import model.Usuario;
import view.CadastroView;
/**
 *
 * @author nicks
 */
public class UsuarioDAO {

   
   private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
   
   public void insert(Usuario usuario) throws SQLException{
       
         
            String sql = "insert into usuarioa (matricula, usuario, senha) values ('"+usuario.getMatricula()+"','"+usuario.getUsuario()+"','"+usuario.getSenha()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
      
       
   }
   
   public boolean ExisteUsuario(Usuario usuario) throws SQLException {
        String sql = "select * from usuarioa where matricula = '"+usuario.getMatricula()+"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        return resultSet.next();
           
    }

   

}
