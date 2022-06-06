/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;

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
public class MenuADAO {
    
     private final Connection connection;

    public MenuADAO(Connection connection) {
        this.connection = connection;
    }
    
     public void comentar(Menua usuario) throws SQLException{
       
         
            String sql = "insert into menua (nomep, cadeira, comentar, nota) values ('"+usuario.getNomea()+"','"+usuario.getCadeira()+"','"+usuario.getComentar()+"', '"+usuario.getNota()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            
      
       
   }
}
